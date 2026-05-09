class MyResource implements AutoCloseable {

    @Override
    public void close() {

        System.out.println("Ресурс закрыт");
    }
}

public class Practice4 {

    public static void main(String[] args) {

        try (MyResource resource = new MyResource()) {

            System.out.println("Работа с ресурсом");
        }
    }
}