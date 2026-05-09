class MyFirstException extends Exception {

    // Конструктор без параметров
    public MyFirstException() {
        super();
    }

    // Конструктор с сообщением
    public MyFirstException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Practice1 {

    public static void main(String[] args) {

        try {

            checkAge(15);

        } catch (MyFirstException e) {

            System.out.println("Перехвачено собственное исключение");
            System.out.println("Сообщение: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws MyFirstException {

        if (age < 18) {
            throw new MyFirstException("Возраст меньше 18");
        }

        System.out.println("Доступ разрешён");
    }
}