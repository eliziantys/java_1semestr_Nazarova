public class Practice2 {
    public static void main(String[] args) {
        String text = "Java";

        // String -> StringBuilder
        StringBuilder sb = new StringBuilder(text);
        System.out.println("String -> StringBuilder: " + sb);

        // String -> StringBuffer
        StringBuffer sbuf = new StringBuffer(text);
        System.out.println("String -> StringBuffer: " + sbuf);

        // StringBuilder -> String
        String textFromBuilder = sb.toString();
        System.out.println("StringBuilder -> String: " + textFromBuilder);

        // StringBuffer -> String
        String textFromBuffer = sbuf.toString();
        System.out.println("StringBuffer -> String: " + textFromBuffer);

        // StringBuilder -> StringBuffer
        StringBuffer fromBuilder = new StringBuffer(sb.toString());
        System.out.println("StringBuilder -> StringBuffer: " + fromBuilder);

        // StringBuffer -> StringBuilder
        StringBuilder fromBuffer = new StringBuilder(sbuf.toString());
        System.out.println("StringBuffer -> StringBuilder: " + fromBuffer);
    }
}
