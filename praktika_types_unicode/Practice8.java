interface Printable {
    void print();
}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Отчет напечатан");
    }
}

public class Practice8 {
    public static void main(String[] args) {
        // Интерфейс задает поведение, которое класс обязан реализовать
        Printable doc = new Report();
        doc.print();

        // var позволяет не писать тип явно
        var number = 10;
        var message = "Пример var";

        System.out.println("var number = " + number);
        System.out.println("var message = " + message);
    }
}
