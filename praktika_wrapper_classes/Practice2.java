public class Practice2 {
    public static void main(String[] args) {
        // Все основные способы получения объекта Boolean
        Boolean b1 = Boolean.TRUE;
        Boolean b2 = Boolean.FALSE;
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf(false);
        Boolean b5 = Boolean.valueOf("true");
        Boolean b6 = Boolean.valueOf("false");
        Boolean b7 = true;
        Boolean b8 = false;

        System.out.println("Boolean.TRUE = " + b1);
        System.out.println("Boolean.FALSE = " + b2);
        System.out.println("valueOf(true) = " + b3);
        System.out.println("valueOf(false) = " + b4);
        System.out.println("valueOf(\"true\") = " + b5);
        System.out.println("valueOf(\"false\") = " + b6);
        System.out.println("boxing true = " + b7);
        System.out.println("boxing false = " + b8);
    }
}
