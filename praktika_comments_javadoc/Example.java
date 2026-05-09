/**
 * Класс показывает простой пример использования javadoc.
 *
 * @author Student
 * @version 1.0
 * @since 1.0
 */
public class Example {

    /**
     * Возвращает строку приветствия.
     *
     * @param name имя пользователя
     * @return строка приветствия
     */
    public String sayHello(String name) {
        return "Привет, " + name;
    }

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.sayHello("Мир"));
    }
}
