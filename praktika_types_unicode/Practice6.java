public class Practice6 {
    public static void main(String[] args) {
        int i = 100;
        byte b = (byte) i;

        int big = 130;
        byte small = (byte) big;

        double pi = 3.99;
        int whole = (int) pi;

        System.out.println("int 100 -> byte: " + b);
        System.out.println("int 130 -> byte: " + small);
        System.out.println("double 3.99 -> int: " + whole);
    }
}
