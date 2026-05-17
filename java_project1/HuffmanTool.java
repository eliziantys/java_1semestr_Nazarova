import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.PriorityQueue;

public class HuffmanTool {
    private static final int MAGIC = 0x48554631; // HUF1

    private static final class Node implements Comparable<Node> {
        final long frequency;
        final int symbol;
        final int minSymbol;
        final Node left;
        final Node right;

        Node(int symbol, long frequency) {
            this.symbol = symbol;
            this.frequency = frequency;
            this.minSymbol = symbol;
            this.left = null;
            this.right = null;
        }

        Node(Node left, Node right) {
            this.symbol = -1;
            this.frequency = left.frequency + right.frequency;
            this.minSymbol = Math.min(left.minSymbol, right.minSymbol);
            this.left = left;
            this.right = right;
        }

        boolean isLeaf() {
            return left == null && right == null;
        }

        @Override
        public int compareTo(Node other) {
            int byFrequency = Long.compare(this.frequency, other.frequency);
            if (byFrequency != 0) {
                return byFrequency;
            }
            return Integer.compare(this.minSymbol, other.minSymbol);
        }
    }

    private static final class BitWriter implements AutoCloseable {
        private final OutputStream out;
        private int currentByte;
        private int bitCount;

        BitWriter(OutputStream out) {
            this.out = out;
        }

        void writeBit(int bit) throws IOException {
            currentByte = (currentByte << 1) | (bit & 1);
            bitCount++;
            if (bitCount == 8) {
                flushByte();
            }
        }

        private void flushByte() throws IOException {
            out.write(currentByte);
            currentByte = 0;
            bitCount = 0;
        }

        @Override
        public void close() throws IOException {
            if (bitCount > 0) {
                currentByte <<= (8 - bitCount);
                flushByte();
            }
        }
    }

    private static final class BitReader {
        private final InputStream in;
        private int currentByte;
        private int bitsLeft;

        BitReader(InputStream in) {
            this.in = in;
        }

        int readBit() throws IOException {
            if (bitsLeft == 0) {
                currentByte = in.read();
                if (currentByte == -1) {
                    throw new EOFException("Unexpected end of encoded data");
                }
                bitsLeft = 8;
            }
            bitsLeft--;
            return (currentByte >> bitsLeft) & 1;
        }
    }

    private static final class Code {
        final String bits;

        Code(String bits) {
            this.bits = bits;
        }

        int length() {
            return bits.length();
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0 || "--help".equals(args[0]) || "-h".equals(args[0])) {
            printUsage();
            return;
        }

        switch (args[0]) {
            case "encode":
                requireArgs(args, 3);
                encode(Path.of(args[1]), Path.of(args[2]));
                break;
            case "decode":
                requireArgs(args, 3);
                decode(Path.of(args[1]), Path.of(args[2]));
                break;
            case "info":
                requireArgs(args, 2);
                printInfo(Path.of(args[1]));
                break;
            default:
                throw new IllegalArgumentException("Unknown command: " + args[0]);
        }
    }

    private static void printUsage() {
        System.out.println("Huffman coding tool");
        System.out.println("Usage:");
        System.out.println("  java HuffmanTool encode <input-file> <encoded-file>");
        System.out.println("  java HuffmanTool decode <encoded-file> <output-file>");
        System.out.println("  java HuffmanTool info <encoded-file>");
    }

    private static void requireArgs(String[] args, int expected) {
        if (args.length != expected) {
            printUsage();
            throw new IllegalArgumentException("Expected " + (expected - 1) + " argument(s)");
        }
    }

    private static void encode(Path inputPath, Path outputPath) throws IOException {
        byte[] input = Files.readAllBytes(inputPath);
        long[] frequencies = buildFrequencies(input);
        Node root = buildTree(frequencies);
        Code[] codes = buildCodes(root);
        long bitLength = countBits(input, codes);

        try (DataOutputStream out = new DataOutputStream(Files.newOutputStream(outputPath))) {
            writeHeader(out, input.length, frequencies, bitLength);
            try (BitWriter bitWriter = new BitWriter(out)) {
                for (byte value : input) {
                    Code code = codes[value & 0xFF];
                    for (int i = 0; i < code.length(); i++) {
                        bitWriter.writeBit(code.bits.charAt(i) == '1' ? 1 : 0);
                    }
                }
            }
        }

        System.out.printf("Encoded %s -> %s (%d bytes -> %d bytes)%n",
                inputPath, outputPath, input.length, Files.size(outputPath));
    }

    private static void decode(Path inputPath, Path outputPath) throws IOException {
        try (DataInputStream in = new DataInputStream(Files.newInputStream(inputPath))) {
            Header header = readHeader(in);
            Node root = buildTree(header.frequencies);
            byte[] decoded = decodePayload(in, root, header.originalLength, header.bitLength);
            Files.write(outputPath, decoded);
        }

        System.out.printf("Decoded %s -> %s (%d bytes)%n", inputPath, outputPath, Files.size(outputPath));
    }

    private static void printInfo(Path encodedPath) throws IOException {
        try (DataInputStream in = new DataInputStream(Files.newInputStream(encodedPath))) {
            Header header = readHeader(in);
            System.out.println("File: " + encodedPath);
            System.out.println("Original length: " + header.originalLength + " bytes");
            System.out.println("Encoded data length: " + header.bitLength + " bits");
            System.out.println("Dictionary size: " + header.symbolCount + " symbol(s)");
            for (int i = 0; i < header.frequencies.length; i++) {
                if (header.frequencies[i] > 0) {
                    System.out.printf("  0x%02X (%d): %d%n", i, i, header.frequencies[i]);
                }
            }
        }
    }

    private static long[] buildFrequencies(byte[] data) {
        long[] frequencies = new long[256];
        for (byte value : data) {
            frequencies[value & 0xFF]++;
        }
        return frequencies;
    }

    private static Node buildTree(long[] frequencies) {
        PriorityQueue<Node> queue = new PriorityQueue<>();
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                queue.add(new Node(i, frequencies[i]));
            }
        }

        if (queue.isEmpty()) {
            return null;
        }

        while (queue.size() > 1) {
            Node first = queue.poll();
            Node second = queue.poll();
            queue.add(new Node(first, second));
        }
        return queue.poll();
    }

    private static Code[] buildCodes(Node root) {
        Code[] codes = new Code[256];
        if (root != null) {
            fillCodes(root, "", codes);
        }
        return codes;
    }

    private static void fillCodes(Node node, String bits, Code[] codes) {
        if (node.isLeaf()) {
            codes[node.symbol] = new Code(bits.isEmpty() ? "0" : bits);
            return;
        }
        fillCodes(node.left, bits + "0", codes);
        fillCodes(node.right, bits + "1", codes);
    }

    private static long countBits(byte[] input, Code[] codes) {
        long result = 0;
        for (byte value : input) {
            result += codes[value & 0xFF].length();
        }
        return result;
    }

    private static void writeHeader(DataOutputStream out, int originalLength, long[] frequencies, long bitLength)
            throws IOException {
        out.writeInt(MAGIC);
        out.writeLong(originalLength);
        out.writeLong(bitLength);
        out.writeShort(countSymbols(frequencies));
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                out.writeByte(i);
                out.writeLong(frequencies[i]);
            }
        }
    }

    private static int countSymbols(long[] frequencies) {
        int count = 0;
        for (long frequency : frequencies) {
            if (frequency > 0) {
                count++;
            }
        }
        return count;
    }

    private static Header readHeader(DataInputStream in) throws IOException {
        int magic = in.readInt();
        if (magic != MAGIC) {
            throw new IOException("Invalid file format: magic header HUF1 not found");
        }

        long originalLength = in.readLong();
        long bitLength = in.readLong();
        int symbolCount = in.readUnsignedShort();
        long[] frequencies = new long[256];

        for (int i = 0; i < symbolCount; i++) {
            int symbol = in.readUnsignedByte();
            long frequency = in.readLong();
            if (frequency <= 0) {
                throw new IOException("Invalid dictionary frequency for symbol " + symbol);
            }
            frequencies[symbol] = frequency;
        }

        long totalFrequency = Arrays.stream(frequencies).sum();
        if (totalFrequency != originalLength) {
            throw new IOException("Invalid dictionary: frequencies do not match original length");
        }
        if (originalLength == 0 && symbolCount != 0) {
            throw new IOException("Invalid empty file dictionary");
        }

        return new Header(originalLength, bitLength, symbolCount, frequencies);
    }

    private static byte[] decodePayload(InputStream in, Node root, long originalLength, long bitLength)
            throws IOException {
        if (originalLength > Integer.MAX_VALUE) {
            throw new IOException("Decoded file is too large for this implementation");
        }
        if (originalLength == 0) {
            return new byte[0];
        }
        if (root == null) {
            throw new IOException("Invalid non-empty file without a dictionary");
        }

        ByteArrayOutputStream decoded = new ByteArrayOutputStream((int) originalLength);
        BitReader bitReader = new BitReader(in);

        if (root.isLeaf()) {
            for (long i = 0; i < originalLength; i++) {
                if (i < bitLength) {
                    bitReader.readBit();
                }
                decoded.write(root.symbol);
            }
            return decoded.toByteArray();
        }

        Node current = root;
        for (long i = 0; i < bitLength && decoded.size() < originalLength; i++) {
            current = bitReader.readBit() == 0 ? current.left : current.right;
            if (current.isLeaf()) {
                decoded.write(current.symbol);
                current = root;
            }
        }

        if (decoded.size() != originalLength) {
            throw new IOException("Encoded data ended before the expected number of bytes was decoded");
        }

        return decoded.toByteArray();
    }

    private static final class Header {
        final long originalLength;
        final long bitLength;
        final int symbolCount;
        final long[] frequencies;

        Header(long originalLength, long bitLength, int symbolCount, long[] frequencies) {
            this.originalLength = originalLength;
            this.bitLength = bitLength;
            this.symbolCount = symbolCount;
            this.frequencies = frequencies;
        }
    }
}
