class Parent {
    protected int a;

    public Parent(int a) {
        this.a = a;
        System.out.println("Конструктор суперкласса");
    }

    public void method() {
        System.out.println("Метод суперкласса");
    }
}

class Child extends Parent {
    private int a;

    public Child(int parentA, int childA) {
        // 1. Обращение к конструктору суперкласса
        super(parentA);
        this.a = childA;
    }

    public void show() {
        // 2. Доступ к полю суперкласса
        System.out.println("Поле суперкласса: " + super.a);
        System.out.println("Поле подкласса: " + this.a);

        // 3. Доступ к методу суперкласса
        super.method();
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Child child = new Child(10, 20);
        child.show();
    }
}
