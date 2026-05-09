class Parent {
    public void show() {
        System.out.println("Метод суперкласса");
    }
}

class Child extends Parent {
    // @Override показывает, что метод переопределяет метод суперкласса
    @Override
    public void show() {
        System.out.println("Метод подкласса");
    }
}

class OldClass {
    // @Deprecated помечает устаревший метод
    @Deprecated
    public void oldMethod() {
        System.out.println("Устаревший метод");
    }

    public void newMethod() {
        System.out.println("Новый метод");
    }
}

public class Practice1 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Child child = new Child();
        child.show();

        OldClass obj = new OldClass();

        // Вызов устаревшего метода
        obj.oldMethod();

        // Подавление предупреждения о raw type
        @SuppressWarnings("rawtypes")
        java.util.ArrayList list = new java.util.ArrayList();
        list.add("test");

        obj.newMethod();
    }
}
