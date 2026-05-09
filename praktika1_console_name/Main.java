import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект для чтения строки из консоли
        Scanner scan = new Scanner(System.in);

        // Просим пользователя ввести имя
        System.out.print("Введите имя: ");
        String name = scan.nextLine();

        // Выводим приветствие
        System.out.println("Привет, " + name);
    }
}
