package same;

public class SamePackageTest {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();

        // private недоступен даже в том же пакете
        // System.out.println(demo.privateValue);
        // demo.privateMethod();

        // Без спецификатора доступ разрешен в том же пакете
        System.out.println(demo.defaultValue);
        demo.defaultMethod();

        // protected тоже доступен в том же пакете
        System.out.println(demo.protectedValue);
        demo.protectedMethod();

        // public доступен везде
        System.out.println(demo.publicValue);
        demo.publicMethod();
    }
}
