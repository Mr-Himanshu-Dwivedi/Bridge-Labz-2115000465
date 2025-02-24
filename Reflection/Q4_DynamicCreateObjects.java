import java.lang.reflect.*;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

public class Q4_DynamicCreateObjects {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Student");
        Constructor<?> constructor = cls.getConstructor(String.class, int.class);

        Student student = (Student) constructor.newInstance("Himanshu", 21);
        student.displayInfo();
    }
}
