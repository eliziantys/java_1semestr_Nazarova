public class Practice2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            // Пропускаем четные числа
            if (i % 2 == 0) {
                continue;
            }

            // Останавливаем цикл, когда дошли до 7
            if (i == 7) {
                break;
            }

            System.out.println("i = " + i);
        }
    }
}
