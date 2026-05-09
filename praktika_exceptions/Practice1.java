public class Practice1 {

    public static void main(String[] args) {

        // Исключение перехватывается
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Исключение перехвачено: деление на ноль");
        }

        // Исключение НЕ перехватывается
        int[] numbers = {1, 2, 3};

        // Ошибка: обращение к несуществующему элементу массива
        System.out.println(numbers[10]);

        System.out.println("Эта строка не выполнится");
    }
}