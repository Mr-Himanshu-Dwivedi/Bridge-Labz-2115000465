import java.util.Scanner;

public class L1_Q13_CompareSumFor {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        // Check if the entered number is a valid natural number (positive integer)
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Compute sum using the formula n*(n+1)/2
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using the for loop
            int loopSum = 0;
            for (int counter = 1; counter <= n; counter++) {
                loopSum += counter;  // Add current counter value to loopSum
            }

            // Compare the results from both computations
            System.out.printf("Sum using formula (n*(n+1)/2): %d%n", formulaSum);
            System.out.printf("Sum using while loop: %d", loopSum);

            // Check if the results are the same
            if (formulaSum == loopSum) {
                System.out.println("Both results are correct and match!");
            } else {
                System.out.println("There seems to be an error in the computation.");
            }
        }

    }
}
