public class Practice3 {
    int a;
    int b;
    int c;
    int z;

    public Practice3() {
        z = 1;
    }

    public Practice3(int a) {
        this();
        this.a = a;
    }

    public Practice3(int a, int b) {
        this(a);
        this.b = b;
    }

    public Practice3(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

    public void print() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("z = " + z);
    }

    public static void main(String[] args) {
        Practice3 obj = new Practice3(1, 2, 3);
        obj.print();
    }
}
