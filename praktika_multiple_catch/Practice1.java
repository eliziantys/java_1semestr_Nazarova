class Ex1 extends Exception {
}

class Ex2 extends Ex1 {
}

class Ex3 extends Ex2 {
}

public class Practice1 {

    public static void main(String[] args) {

        // Несколько исключений обрабатываются одинаково
        try {
            int value = args.length;

            if (value == 0) {
                int x = 10 / 0; // ArithmeticException
            } else {
                int[] arr = new int[2];
                System.out.println(arr[10]); // ArrayIndexOutOfBoundsException
            }

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Одинаковая обработка нескольких исключений");
        }

        // Исключения образуют иерархию
        try {
            generateException(3);

        } catch (Ex3 e) {
            System.out.println("Перехвачено Ex3");

        } catch (Ex2 e) {
            System.out.println("Перехвачено Ex2");

        } catch (Ex1 e) {
            System.out.println("Перехвачено Ex1");
        }
    }

    static void generateException(int type) throws Ex1 {

        if (type == 1) {
            throw new Ex1();

        } else if (type == 2) {
            throw new Ex2();

        } else {
            throw new Ex3();
        }
    }
}