public class Practice1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // append(...) добавляет данные в конец строки
        sb.append(" Code");
        System.out.println("append: " + sb);

        // insert(...) вставляет данные по указанному индексу
        sb.insert(4, " and");
        System.out.println("insert: " + sb);

        // replace(...) заменяет часть строки
        sb.replace(0, 4, "Kotlin");
        System.out.println("replace: " + sb);

        // delete(...) удаляет часть строки
        sb.delete(6, 10);
        System.out.println("delete: " + sb);

        // deleteCharAt(...) удаляет символ по индексу
        sb.deleteCharAt(0);
        System.out.println("deleteCharAt: " + sb);

        // reverse() переворачивает строку
        sb.reverse();
        System.out.println("reverse: " + sb);

        // charAt(...) возвращает символ по индексу
        System.out.println("charAt(1): " + sb.charAt(1));

        // setCharAt(...) изменяет символ по индексу
        sb.setCharAt(1, '*');
        System.out.println("setCharAt: " + sb);

        // length() возвращает длину строки
        System.out.println("length: " + sb.length());

        // capacity() возвращает текущую емкость буфера
        System.out.println("capacity: " + sb.capacity());

        StringBuffer buffer = new StringBuffer("Hello");

        // append(...) для StringBuffer тоже добавляет данные в конец
        buffer.append(" World");
        System.out.println("StringBuffer append: " + buffer);
    }
}
