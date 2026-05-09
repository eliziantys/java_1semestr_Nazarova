interface First {
    default void show() {
        System.out.println("First.show()");
    }
}

interface Second {
    default void show() {
        System.out.println("Second.show()");
    }
}

class Demo implements First, Second {
    // Класс обязан сам разрешить конфликт
    @Override
    public void show() {
        System.out.println("Разрешение конфликта методов");

        // При необходимости можно явно вызвать методы обоих интерфейсов
        First.super.show();
        Second.super.show();
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();
    }
}
