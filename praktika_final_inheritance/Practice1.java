class Parent {
    // Такой метод нельзя переопределять в подклассе
    public final void show() {
        System.out.println("Метод суперкласса");
    }
}

class Child extends Parent {
    /*
    // Так делать нельзя, будет ошибка компиляции
    @Override
    public void show() {
        System.out.println("Метод подкласса");
    }
    */
}

public class Practice1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}
