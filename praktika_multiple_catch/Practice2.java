public class Practice2 {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

        } catch (final Exception e) {

            System.out.println("Исключение перехвачено");

            // Ошибка:
            // e = new Exception();

            // final запрещает изменять ссылку e
        }
    }
}