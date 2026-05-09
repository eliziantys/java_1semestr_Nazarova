public class Practice1 {
    public static void main(String[] args) {
        // Операторы присваивания
        int a = 10;
        System.out.println("= : a = " + a);

        a += 5;
        System.out.println("+= : " + a);

        a -= 3;
        System.out.println("-= : " + a);

        a *= 2;
        System.out.println("*= : " + a);

        a /= 4;
        System.out.println("/= : " + a);

        a %= 3;
        System.out.println("%= : " + a);

        // Тернарный оператор
        int x = 7;
        String result = (x > 5) ? "x больше 5" : "x не больше 5";
        System.out.println("?: " + result);

        // Логические операторы
        boolean p = true;
        boolean q = false;
        System.out.println("|| : " + (p || q));
        System.out.println("&& : " + (p && q));
        System.out.println("| : " + (p | q));
        System.out.println("^ : " + (p ^ q));
        System.out.println("& : " + (p & q));

        // Операторы сравнения
        System.out.println("== : " + (5 == 5));
        System.out.println("!= : " + (5 != 3));
        System.out.println("> : " + (8 > 3));
        System.out.println(">= : " + (8 >= 8));
        System.out.println("< : " + (2 < 7));
        System.out.println("<= : " + (2 <= 2));

        // Побитовые сдвиги
        int b = 8;
        System.out.println(">> : " + (b >> 1));
        System.out.println(">>> : " + (b >>> 1));
        System.out.println("<< : " + (b << 1));

        // Арифметические операторы
        int m = 9;
        int n = 4;
        System.out.println("+ : " + (m + n));
        System.out.println("- : " + (m - n));
        System.out.println("* : " + (m * n));
        System.out.println("/ : " + (m / n));
        System.out.println("% : " + (m % n));

        // Префиксная и постфиксная формы
        int c = 5;
        System.out.println("Префиксный ++ : " + (++c));
        System.out.println("После префиксного ++ : " + c);

        int d = 5;
        System.out.println("Постфиксный ++ : " + (d++));
        System.out.println("После постфиксного ++ : " + d);

        int e = 5;
        System.out.println("Префиксный -- : " + (--e));
        System.out.println("После префиксного -- : " + e);

        int f = 5;
        System.out.println("Постфиксный -- : " + (f--));
        System.out.println("После постфиксного -- : " + f);

        // Унарные операторы
        int g = 10;
        System.out.println("~ : " + (~g));
        System.out.println("! : " + (!false));

        // Скобки
        System.out.println("( ) : " + ((2 + 3) * 4));

        // Квадратные скобки
        int[] arr = {10, 20, 30};
        System.out.println("[ ] : " + arr[1]);

        // Операторы со String
        String s1 = "Привет";
        String s2 = "мир";
        String s3 = s1 + ", " + s2;
        System.out.println("String + : " + s3);

        s3 += "!";
        System.out.println("String += : " + s3);

        System.out.println("String == : " + ("Java" == "Java"));
        System.out.println("String != : " + (s1 != s2));
    }
}
