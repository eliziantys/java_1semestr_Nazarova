public class Practice1 {
    public static void main(String[] args) {
        String text = "  Java Programming  ";
        String text2 = "java programming";

        // length() возвращает длину строки
        System.out.println("length(): " + text.length());

        // trim() убирает пробелы в начале и конце строки
        System.out.println("trim(): " + text.trim());

        // toUpperCase() переводит строку в верхний регистр
        System.out.println("toUpperCase(): " + text.toUpperCase());

        // toLowerCase() переводит строку в нижний регистр
        System.out.println("toLowerCase(): " + text.toLowerCase());

        // charAt(index) возвращает символ по индексу
        System.out.println("charAt(2): " + text.charAt(2));

        // substring(begin, end) возвращает часть строки
        System.out.println("substring(2, 6): " + text.substring(2, 6));

        // contains(...) проверяет, содержит ли строка подстроку
        System.out.println("contains(\"Java\"): " + text.contains("Java"));

        // equals(...) сравнивает строки с учетом регистра
        System.out.println("equals(...): " + text.trim().equals(text2));

        // equalsIgnoreCase(...) сравнивает строки без учета регистра
        System.out.println("equalsIgnoreCase(...): " + text.trim().equalsIgnoreCase(text2));

        // replace(old, new) заменяет одну подстроку другой
        System.out.println("replace(...): " + text.replace("Java", "Kotlin"));
    }
}
