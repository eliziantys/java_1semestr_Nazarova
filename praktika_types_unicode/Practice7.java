public class Practice7 {
    public static void main(String[] args) {
        int a = 120;
        byte c = (byte) (a + 10);

        System.out.println("b: ошибка компиляции");
        System.out.println("c: " + c);
        System.out.println("d: ошибка компиляции");
        System.out.println("Выражения a + 10 и a + 1 имеют тип int.");
        System.out.println("Для byte нужно явное приведение типа.");
    }
}
