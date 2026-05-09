public class Practice1 {
    public static void main(String[] args) {
        int a = 0;

        // Тривиальный бесконечный цикл while
        while (true) {
            a++;
            System.out.println("while: " + a);

            // Выход добавлен специально, чтобы пример не зависал
            if (a == 3) {
                break;
            }
        }

        int b = 0;

        // Тривиальный бесконечный цикл do-while
        do {
            b++;
            System.out.println("do-while: " + b);

            // Выход добавлен специально, чтобы пример не зависал
            if (b == 3) {
                break;
            }
        } while (true);
    }
}
