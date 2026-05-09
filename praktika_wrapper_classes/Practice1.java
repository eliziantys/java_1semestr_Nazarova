public class Practice1 {
    public static void main(String[] args) {
        // decode распознает десятичную, восьмеричную и шестнадцатеричную запись
        Integer a = Integer.decode("25");
        Integer b = Integer.decode("012");
        Integer c = Integer.decode("0x12");
        Integer d = Integer.decode("#1A");

        System.out.println("decode(\"25\") = " + a);
        System.out.println("decode(\"012\") = " + b);
        System.out.println("decode(\"0x12\") = " + c);
        System.out.println("decode(\"#1A\") = " + d);
    }
}
