import java.util.Scanner;

public class L2_Q5_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number > 0) {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Use ternary operators to check the conditions and print results
                String result = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" :
                        (i % 3 == 0) ? "Fizz" :
                                (i % 5 == 0) ? "Buzz" :
                                        Integer.toString(i);

                // Print the result
                System.out.println(result);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
