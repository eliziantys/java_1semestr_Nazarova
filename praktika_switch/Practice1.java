enum Day {
    MONDAY,
    TUESDAY
}

public class Practice1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';
        int i = 3;

        Byte wb = 1;
        Short ws = 2;
        Character wc = 'B';
        Integer wi = 4;

        String text = "hi";
        Day day = Day.MONDAY;

        switch (b) {
            case 1:
                System.out.println("byte");
                break;
            default:
                break;
        }

        switch (s) {
            case 2:
                System.out.println("short");
                break;
            default:
                break;
        }

        switch (c) {
            case 'A':
                System.out.println("char");
                break;
            default:
                break;
        }

        switch (i) {
            case 3:
                System.out.println("int");
                break;
            default:
                break;
        }

        switch (wb) {
            case 1:
                System.out.println("Byte");
                break;
            default:
                break;
        }

        switch (ws) {
            case 2:
                System.out.println("Short");
                break;
            default:
                break;
        }

        switch (wc) {
            case 'B':
                System.out.println("Character");
                break;
            default:
                break;
        }

        switch (wi) {
            case 4:
                System.out.println("Integer");
                break;
            default:
                break;
        }

        switch (text) {
            case "hi":
                System.out.println("String");
                break;
            default:
                break;
        }

        switch (day) {
            case MONDAY:
                System.out.println("enum");
                break;
            default:
                break;
        }
    }
}
