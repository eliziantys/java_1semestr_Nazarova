class Printer {
    // Перегрузка: один и тот же метод, но разные параметры
    public void print(String text) {
        System.out.println("Строка: " + text);
    }

    public void print(int number) {
        System.out.println("Число: " + number);
    }
}

class Animal {
    // Метод суперкласса
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    // Переопределение метода суперкласса
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Пример перегрузки
        printer.print("Привет");
        printer.print(10);

        Animal a = new Animal();
        Animal d = new Dog();

        // Пример переопределения
        a.sound();
        d.sound();
    }
}
