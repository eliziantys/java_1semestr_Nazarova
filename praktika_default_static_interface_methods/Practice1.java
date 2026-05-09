interface Info {
    // Неабстрактный метод интерфейса
    default void show() {
        System.out.println("Default method of interface");
    }

    // Статический метод интерфейса
    static void printStatic() {
        System.out.println("Static method of interface");
    }
}

class InfoImpl implements Info {
    // При желании default-метод можно переопределить
    @Override
    public void show() {
        System.out.println("Method in implementing class");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        InfoImpl obj = new InfoImpl();
        Info ref = obj;

        // Вызов метода через объект класса
        obj.show();

        // Вызов метода через ссылку на интерфейс
        ref.show();

        // Вызов статического метода интерфейса
        Info.printStatic();
    }
}
