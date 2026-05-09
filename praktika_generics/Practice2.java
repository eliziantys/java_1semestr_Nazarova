import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    // <? extends Number> удобно для чтения данных
    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    // <? super Integer> удобно для записи данных
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.5);
        doubles.add(2.5);

        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        // extends: можно передавать список Integer и Double как потомков Number
        printNumbers(ints);
        printNumbers(doubles);

        // super: можно передавать список Number и Object как предков Integer
        addNumbers(numbers);
        addNumbers(objects);

        System.out.println(numbers);
        System.out.println(objects);
    }
}
