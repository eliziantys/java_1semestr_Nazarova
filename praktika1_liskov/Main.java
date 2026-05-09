// Практика 1
// Краткий пример принципа подстановки Лисков

class Bird {
    // Любая птица должна уметь как-то перемещаться
    public void move() {
        System.out.println("Птица перемещается");
    }
}

class Sparrow extends Bird {
    // Воробей летает
    @Override
    public void move() {
        System.out.println("Воробей летает");
    }
}

class Penguin extends Bird {
    // Пингвин не летает, но все равно перемещается как птица
    @Override
    public void move() {
        System.out.println("Пингвин плавает");
    }
}

public class Main {
    // Метод работает с базовым типом Bird
    public static void showMovement(Bird bird) {
        bird.move();
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        // Оба объекта можно подставить вместо Bird
        showMovement(sparrow);
        showMovement(penguin);

        // Это и есть принцип подстановки Лисков:
        // потомки можно использовать там, где ожидается родитель
    }
}
