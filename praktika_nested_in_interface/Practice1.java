interface Info {
    // Вложенный класс внутри интерфейса
    class Helper {
        public void show() {
            System.out.println("Метод вложенного класса в интерфейсе");
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Создание объекта вложенного класса через имя интерфейса
        Info.Helper helper = new Info.Helper();
        helper.show();
    }
}
