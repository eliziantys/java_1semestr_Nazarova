import java.util.Objects;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Если сравниваем объект сам с собой, то они равны
        if (this == obj) {
            return true;
        }

        // Если передан null или объект другого класса, то они не равны
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Приводим тип и сравниваем поля
        Student other = (Student) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Student s1 = new Student("Иван", 20);
        Student s2 = new Student("Иван", 20);
        Student s3 = new Student("Петр", 21);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
