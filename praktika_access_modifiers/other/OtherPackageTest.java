package other;

import same.AccessDemo;

public class OtherPackageTest {
    public static void main(String[] args) {
        AccessDemo demo = new AccessDemo();

        // private недоступен
        // System.out.println(demo.privateValue);

        // Без спецификатора недоступен из другого пакета
        // System.out.println(demo.defaultValue);

        // protected недоступен через обычный объект из другого пакета
        // System.out.println(demo.protectedValue);

        // public доступен
        System.out.println(demo.publicValue);
        demo.publicMethod();

        // protected можно использовать в подклассе из другого пакета
        ChildInOtherPackage child = new ChildInOtherPackage();
        child.showFromChild();
    }
}
