class InitAtDeclaration {
    // Вариант 1: инициализация сразу при объявлении
    public final int a = 10;
}

class InitInBlock {
    public final int a;

    // Вариант 2: инициализация в блоке инициализации объекта
    {
        a = 20;
    }
}

class InitInConstructor {
    public final int a;

    // Вариант 3: инициализация в конструкторе
    public InitInConstructor(int value) {
        a = value;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        InitAtDeclaration x = new InitAtDeclaration();
        InitInBlock y = new InitInBlock();
        InitInConstructor z = new InitInConstructor(30);

        System.out.println(x.a);
        System.out.println(y.a);
        System.out.println(z.a);
    }
}
