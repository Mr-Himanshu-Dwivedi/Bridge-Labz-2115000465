import java.util.Scanner;

public class L1_Q10_SumTillZero {
    public static void main(String[] args) {
        // Initialize total to 0.0
        double total = 0.0;

        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);
        // Variable to store the user input
        double number;

        // Prompt user to enter numbers and sum them until 0 is entered
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();  // Read the user input

            // Add the entered number to the total (unless it is 0)
            if (number != 0) {
                total += number;
            }
        } while (number != 0);  // Continue until the user enters 0

        // Display the total sum of the numbers entered
        System.out.println("Total sum: " + total);
    }
}
