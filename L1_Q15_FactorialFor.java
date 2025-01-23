import java.util.Scanner;

public class L1_Q15_FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        int n = sc.nextInt();

        // Check if the number is positive
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;

            // Calculate the factorial using a while loop
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Print the factorial
            System.out.printf("The factorial is %d\n", factorial);
        }
    }
}
