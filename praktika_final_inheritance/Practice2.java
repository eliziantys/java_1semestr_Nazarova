final class FinalClass {
    public void print() {
        System.out.println("Это final-класс");
    }
}

/*
// Так делать нельзя, будет ошибка компиляции
class Child extends FinalClass {
}
*/

public class Practice2 {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.print();
    }
}
