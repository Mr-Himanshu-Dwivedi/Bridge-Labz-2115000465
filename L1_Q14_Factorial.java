import java.util.Scanner;

public class L1_Q14_Factorial {
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
            while (n > 1) {
                factorial *= n;
                n--;
            }

            // Print the factorial
            System.out.printf("The factorial is %d\n", factorial);
        }
    }
}
