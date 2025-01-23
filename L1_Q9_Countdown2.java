import java.util.Scanner;

public class L1_Q9_Countdown2 {
    public static void main(String[] args) {
        // Get user input for the countdown start value
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        for(int i= counter;i>0;i--)
            System.out.println(i);

        // Print "Liftoff!" once countdown is finished
        System.out.println("Liftoff!");
    }
}
