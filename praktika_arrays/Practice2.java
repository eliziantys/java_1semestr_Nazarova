import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 7};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};

        // toString(...) преобразует массив в строку
        System.out.println("toString: " + Arrays.toString(arr1));

        // sort(...) сортирует массив
        Arrays.sort(arr1);
        System.out.println("sort: " + Arrays.toString(arr1));

        // binarySearch(...) ищет элемент в отсортированном массиве
        int index = Arrays.binarySearch(arr1, 7);
        System.out.println("binarySearch(7): " + index);

        // equals(...) сравнивает содержимое массивов
        boolean eq = Arrays.equals(arr2, arr3);
        System.out.println("equals: " + eq);

        // compare(...) сравнивает массивы лексикографически
        int cmp = Arrays.compare(arr2, arr1);
        System.out.println("compare: " + cmp);
    }
}
