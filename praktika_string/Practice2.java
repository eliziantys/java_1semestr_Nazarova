import java.util.StringJoiner;

public class Practice2 {
    public static void main(String[] args) {
        // Пример простого объединения строк через разделитель
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Java");
        joiner1.add("Python");
        joiner1.add("C++");
        System.out.println(joiner1);

        // Пример объединения строк с префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(" - ", "[", "]");
        joiner2.add("red");
        joiner2.add("green");
        joiner2.add("blue");
        System.out.println(joiner2);

        // Пример объединения двух StringJoiner
        StringJoiner joiner3 = new StringJoiner(", ");
        joiner3.add("one");
        joiner3.add("two");

        StringJoiner joiner4 = new StringJoiner(", ");
        joiner4.add("three");
        joiner4.add("four");

        joiner3.merge(joiner4);
        System.out.println(joiner3);
    }
}
