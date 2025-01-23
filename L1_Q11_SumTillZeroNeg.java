import java.util.Scanner;

public class L1_Q11_SumTillZeroNeg {
    public static void main(String[] args) {
        // Initialize total to 0.0
        double total = 0.0;

        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Infinite while loop to get user input
        while (true) {
            System.out.print("Enter a number (0 or -ve number to stop): ");
            double number = sc.nextDouble();  // Read the user input

            // Check if the entered number is 0 or negative, then break the loop
            if (number <= 0) {
                break;  // Exit the loop if the number is 0 or negative
            }

            // Add the entered number to the total
            total += number;
        }

        // Display the total sum of the numbers entered
        System.out.println("Total sum: " + total);
    }
}
