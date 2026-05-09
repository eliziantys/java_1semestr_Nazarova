import java.util.Date;
import java.util.Formatter;

public class Practice3 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Date now = new Date();

        // %tH - час в формате 00-23
        fmt.format("%%tH -> %tH%n", now);

        // %tM - минуты
        fmt.format("%%tM -> %tM%n", now);

        // %tS - секунды
        fmt.format("%%tS -> %tS%n", now);

        // %tY - год в четырехзначном формате
        fmt.format("%%tY -> %tY%n", now);

        // %tB - полное название месяца
        fmt.format("%%tB -> %tB%n", now);

        System.out.print(fmt);
        fmt.close();
    }
}
