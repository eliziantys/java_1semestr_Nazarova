class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>(10);
        Wrapper<String> strWrapper = new Wrapper<>("Java");
        Object obj = intWrapper;

        // Так можно: проверка идет по самому классу Wrapper
        System.out.println(obj instanceof Wrapper<?>);

        // Так тоже можно
        if (strWrapper instanceof Wrapper<?>) {
            System.out.println("strWrapper является объектом Wrapper");
        }

        // Так нельзя, потому что параметр типа стирается после компиляции:
        // obj instanceof Wrapper<Integer>
        // strWrapper instanceof Wrapper<String>
    }
}
