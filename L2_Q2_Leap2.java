import java.util.Scanner;

public class L2_Q2_Leap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take year input from the user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Single if statement with logical operators to check for leap year
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.printf("%d is a Leap Year.\n", year);
        } else if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            System.out.printf("%d is not a Leap Year.\n", year);
        }
    }
}
