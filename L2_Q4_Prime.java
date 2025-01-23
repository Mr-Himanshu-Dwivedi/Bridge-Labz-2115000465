import java.util.Scanner;

public class L2_Q4_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // A number must be greater than 1 to be a prime number
        boolean isPrime = (number > 1);  // Initialize isPrime to true, unless the number is 1 or less

        // Check if the number is divisible by any number from 2 to the number-1
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;  // If divisible, it's not a prime number
                break;  // No need to check further, exit the loop
            }
        }

        // Print the result
        if (isPrime) {
            System.out.printf("%d is a Prime Number.\n", number);
        } else {
            System.out.printf("%d is not a Prime Number.\n", number);
        }
    }
}
