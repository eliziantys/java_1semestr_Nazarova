class Calculator {
    // Перегрузка: одинаковое имя, но разные параметры
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(2, 3, 4));
        System.out.println(calc.sum(2.5, 3.5));
    }
}
