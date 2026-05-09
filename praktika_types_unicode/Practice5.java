public class Practice5 {
    public static void main(String[] args) {
        int x = 5;
        double y = 2.5;
        double result1 = x + y;

        byte a = 10;
        short b = 20;
        int result2 = a + b;

        long c = 100L;
        float d = 1.5f;
        float result3 = c + d;

        System.out.println("int + double = " + result1 + ", тип результата double");
        System.out.println("byte + short = " + result2 + ", тип результата int");
        System.out.println("long + float = " + result3 + ", тип результата float");
    }
}
