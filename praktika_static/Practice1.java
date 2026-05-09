class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Правильный и основной способ вызова статического метода
        A.printVars();

        // Вызов через объект тоже возможен, но так делать не рекомендуется
        A obj = new A();
        obj.printVars();

        // Еще один вызов через переменную со ссылкой на объект
        A ref = obj;
        ref.printVars();
    }
}
