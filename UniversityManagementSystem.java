class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.printf("Roll Number: %d, Name: %s, CGPA: %.2f\n", rollNumber, name, CGPA);
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayPostgraduateDetails() {
        System.out.printf("Postgraduate Student - Roll Number: %d, Name: %s, CGPA: %.2f\n", rollNumber, name, getCGPA());
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 9.2);
        student1.displayStudentDetails();

        student1.setCGPA(9.5);
        System.out.println("\nAfter updating CGPA:");
        student1.displayStudentDetails();

        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.8);
        pgStudent.displayPostgraduateDetails();
    }
}
