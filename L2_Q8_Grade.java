import java.util.Scanner;

public class L2_Q8_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            int physics, chemistry, math;

            // Take input for marks and validate that they are positive
            do {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                physics = sc.nextInt();
                if (physics < 0) {
                    System.out.println("Marks must be positive. Please enter again.");
                }
            } while (physics < 0);

            do {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                chemistry = sc.nextInt();
                if (chemistry < 0) {
                    System.out.println("Marks must be positive. Please enter again.");
                }
            } while (chemistry < 0);

            do {
                System.out.print("Enter Math marks for student " + (i + 1) + ": ");
                math = sc.nextInt();
                if (math < 0) {
                    System.out.println("Marks must be positive. Please enter again.");
                }
            } while (math < 0);

            // Store the marks in the arrays
            physicsMarks[i] = physics;
            chemistryMarks[i] = chemistry;
            mathMarks[i] = math;

            // Calculate the percentage and grade
            double average = (physics + chemistry + math) / 3.0;
            percentages[i] = average;

            if (average >= 80) {
                grades[i] = "A";
            } else if (average >= 70) {
                grades[i] = "B";
            } else if (average >= 60) {
                grades[i] = "C";
            } else if (average >= 50) {
                grades[i] = "D";
            } else if (average >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d - Physics: %d, Chemistry: %d, Math: %d, Average: %.2f, Grade: %s%n",
                    i + 1, physicsMarks[i], chemistryMarks[i], mathMarks[i], percentages[i], grades[i]);
        }

    }
}
