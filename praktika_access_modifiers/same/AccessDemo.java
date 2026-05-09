package same;

public class AccessDemo {
    // Доступно только внутри этого класса
    private int privateValue = 1;

    // Доступно в пределах того же пакета
    int defaultValue = 2;

    // Доступно в том же пакете и в подклассах из других пакетов
    protected int protectedValue = 3;

    // Доступно отовсюду
    public int publicValue = 4;

    public AccessDemo() {
    }

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

    public void showInsideClass() {
        // Внутри своего класса доступны все члены
        System.out.println(privateValue);
        System.out.println(defaultValue);
        System.out.println(protectedValue);
        System.out.println(publicValue);

        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
