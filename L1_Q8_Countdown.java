import java.util.Scanner;

public class L1_Q8_Countdown {
    public static void main(String[] args) {
        // Get user input for the countdown start value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  // Decrease counter by 1
        }

        // Print "Liftoff!" once countdown is finished
        System.out.println("Liftoff!");
    }
}
