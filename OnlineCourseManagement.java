class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "XYZ Institute"; // Class variable shared by all courses

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.printf("Course Name: %s, Duration: %d months, Fee: %.2f, Institute: %s\n",
                courseName, duration, fee, instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;  // Update the class variable
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 6, 400.00);
        Course course2 = new Course("Web Development", 3, 250.00);
        Course course3 = new Course("Data Science", 9, 600.00);

        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();

        // Update the institute name for all courses
        Course.updateInstituteName("ABC Academy");

        System.out.println("\nAfter updating institute name:\n");

        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}
