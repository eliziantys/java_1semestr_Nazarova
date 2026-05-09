class Parent {
    public void print(String text) {
        System.out.println("Parent: " + text);
    }
}

class Child extends Parent {
    /*
    // Здесь допущена ошибка: параметр int вместо String
    // Без @Override это был бы просто новый метод, а не переопределение
    @Override
    public void print(int text) {
        System.out.println("Child: " + text);
    }
    */
}

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("Пример ошибки показан в комментарии.");
    }
}
