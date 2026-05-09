class Animal {
}

class Dog extends Animal {
}

public class Practice2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Animal ad = new Dog();
        Animal empty = null;

        // Обычные примеры instanceof
        System.out.println("a instanceof Animal: " + (a instanceof Animal));
        System.out.println("d instanceof Dog: " + (d instanceof Dog));
        System.out.println("d instanceof Animal: " + (d instanceof Animal));
        System.out.println("ad instanceof Dog: " + (ad instanceof Dog));

        // Пример с null
        System.out.println("empty instanceof Animal: " + (empty instanceof Animal));
    }
}
