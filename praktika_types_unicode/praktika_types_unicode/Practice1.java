public class Practice1 {
    // Поля класса имеют значения по умолчанию
    byte fieldByte;
    short fieldShort;
    int fieldInt;
    long fieldLong;
    float fieldFloat;
    double fieldDouble;
    char fieldChar;
    boolean fieldBoolean;

    public static void main(String[] args) {
        Practice1 demo = new Practice1();

        byte a = 5;
        byte aZero = 0;

        short b = 1000;
        short bZero = 0;

        int c = 100000;
        int cZero = 0;

        long d = 10000000000L;
        long dZero = 0L;

        float e = 3.14f;
        float eZero = 0.0f;

        double f = 9.99;
        double fZero = 0.0;

        char g = 'A';
        char gZero = '\u0000';

        boolean h = true;
        boolean hZero = false;

        System.out.println("byte: " + a + ", нулевое: " + aZero);
        System.out.println("short: " + b + ", нулевое: " + bZero);
        System.out.println("int: " + c + ", нулевое: " + cZero);
        System.out.println("long: " + d + ", нулевое: " + dZero);
        System.out.println("float: " + e + ", нулевое: " + eZero);
        System.out.println("double: " + f + ", нулевое: " + fZero);
        System.out.println("char: " + g + ", нулевое Unicode: " + (int) gZero);
        System.out.println("boolean: " + h + ", нулевое: " + hZero);

        System.out.println("Значения по умолчанию у полей класса:");
        System.out.println(demo.fieldByte);
        System.out.println(demo.fieldShort);
        System.out.println(demo.fieldInt);
        System.out.println(demo.fieldLong);
        System.out.println(demo.fieldFloat);
        System.out.println(demo.fieldDouble);
        System.out.println((int) demo.fieldChar);
        System.out.println(demo.fieldBoolean);
    }
}
