class Printer {
    // Метод с переменным числом параметров int
    public void print(int... numbers) {
        System.out.print("int: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // Перегруженный метод с переменным числом параметров String
    public void print(String... words) {
        System.out.print("String: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    // Еще один перегруженный метод:
    // первый параметр обычный, остальные переменные
    public void print(String title, int... numbers) {
        System.out.print(title + ": ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print(1, 2, 3, 4);
        printer.print("Java", "OOP", "Code");
        printer.print("Числа", 10, 20, 30);
    }
}
