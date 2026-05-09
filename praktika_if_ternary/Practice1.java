public class Practice1 {
    public static void main(String[] args) {
        int a = 2;

        // Переписываем if-else if-else через тернарный оператор
        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3;

        System.out.println("a = " + a);
        System.out.println("i = " + i);
    }
}
