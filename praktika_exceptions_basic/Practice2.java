public class Practice2 {
    public static void main(String[] args) {
        // ArithmeticException
        try {
            int x = 10 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: деление на ноль");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: выход за границы массива");
        }

        // IllegalArgumentException
        try {
            checkAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // ClassCastException
        try {
            Object obj = "Java";
            Integer num = (Integer) obj;
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: неверное приведение типа");
        }

        // NullPointerException
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: обращение к null");
        }
    }

    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("возраст не может быть отрицательным");
        }
    }
}
