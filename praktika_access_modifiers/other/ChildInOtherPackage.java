package other;

import same.AccessDemo;

public class ChildInOtherPackage extends AccessDemo {
    public void showFromChild() {
        // private недоступен
        // System.out.println(privateValue);

        // Без спецификатора тоже недоступен из другого пакета
        // System.out.println(defaultValue);

        // protected доступен через наследование
        System.out.println(protectedValue);
        protectedMethod();

        // public доступен везде
        System.out.println(publicValue);
        publicMethod();
    }
}
