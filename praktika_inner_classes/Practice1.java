public class Practice1 {
    private String secret = "private field";
    String text = "default field";
    protected int number = 10;
    public String name = "public field";

    private void privateMethod() {
        System.out.println("privateMethod()");
    }

    void defaultMethod() {
        System.out.println("defaultMethod()");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod()");
    }

    public void publicMethod() {
        System.out.println("publicMethod()");
    }

    // public внутренний класс доступен отовсюду
    public class PublicInner {
        public void show() {
            System.out.println("PublicInner");
            System.out.println(secret);
            System.out.println(text);
            System.out.println(number);
            System.out.println(name);
            privateMethod();
            defaultMethod();
            protectedMethod();
            publicMethod();
        }
    }

    // private внутренний класс доступен только внутри внешнего класса
    private class PrivateInner {
        private String value = "inner private value";

        private void print() {
            System.out.println("PrivateInner.print()");
        }
    }

    // protected внутренний класс
    protected class ProtectedInner {
        public void show() {
            System.out.println("ProtectedInner");
        }
    }

    // внутренний класс без спецификатора доступа
    class DefaultInner {
        public void show() {
            System.out.println("DefaultInner");
        }
    }

    public void accessPrivateInner() {
        // Внешний класс имеет доступ даже к private-членам внутреннего класса
        PrivateInner inner = new PrivateInner();
        System.out.println(inner.value);
        inner.print();
    }

    public static void main(String[] args) {
        Practice1 outer = new Practice1();

        Practice1.PublicInner p = outer.new PublicInner();
        p.show();

        Practice1.ProtectedInner pr = outer.new ProtectedInner();
        pr.show();

        Practice1.DefaultInner d = outer.new DefaultInner();
        d.show();

        outer.accessPrivateInner();
    }
}
