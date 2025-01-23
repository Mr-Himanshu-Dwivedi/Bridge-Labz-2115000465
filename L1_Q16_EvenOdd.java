import java.util.Scanner;

public class L1_Q16_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        int number = sc.nextInt();

        // Check if the number is a positive natural number
        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // Iterate from 1 to the entered number using a for loop
            for (int i = 1; i <= number; i++) {
                // Check if the current number is odd or even
                if (i % 2 == 0) {
                    System.out.printf("%d is even\n", i);
                } else {
                    System.out.printf("%d is odd\n", i);
                }
            }
        }
    }
}
