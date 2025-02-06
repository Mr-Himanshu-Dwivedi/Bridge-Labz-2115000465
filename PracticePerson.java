import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person() {
        name = "Unknown";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayPersonDetails() {
        System.out.printf("Name: %s, Age: %d\n", name, age);
    }
}

public class PracticePerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Person person1 = new Person(name, age);
        Person person2 = new Person(person1);

        person1.displayPersonDetails();
        person2.displayPersonDetails();
    }
}
