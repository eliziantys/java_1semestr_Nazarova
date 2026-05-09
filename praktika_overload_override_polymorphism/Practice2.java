class Animal {
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Кошка мяукает");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Cat();

        // Вызов метода выбирается во время выполнения
        a1.sound();
        a2.sound();
    }
}
