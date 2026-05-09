import java.util.Formatter;

public class Practice1 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();

        boolean flag = true;
        char ch = 'A';
        int number = 125;
        double pi = 3.14159;
        String text = "Java";

        // %b - логическое значение
        fmt.format("%%b -> %b%n", flag);

        // %c - символ
        fmt.format("%%c -> %c%n", ch);

        // %d - целое десятичное число
        fmt.format("%%d -> %d%n", number);

        // %f - число с плавающей точкой
        fmt.format("%%f -> %f%n", pi);

        // %s - строковое представление
        fmt.format("%%s -> %s%n", text);

        System.out.print(fmt);
        fmt.close();
    }
}
