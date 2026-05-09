public class Practice2 {
    public static void main(String[] args) {
        int value = 2;
        int i = 0;

        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }

        // При value = 2 сначала выполняется case 2,
        // затем из-за отсутствия break выполняется и case 3
        System.out.println("i = " + i);
    }
}
