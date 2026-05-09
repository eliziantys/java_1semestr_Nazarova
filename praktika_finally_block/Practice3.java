public class Practice3 {

    public static void main(String[] args) {

        // Такой код НЕ скомпилируется

        /*
        try {
            System.out.println("try");
        } finally {
            System.out.println("finally 1");
        } finally {
            System.out.println("finally 2");
        }
        */

        System.out.println(
                "У try может быть только один finally"
        );
    }
}