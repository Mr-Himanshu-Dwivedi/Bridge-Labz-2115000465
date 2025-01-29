import java.util.*;

public class Extras_Q1_NumGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");

        while (true) {
            guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);

            System.out.println("Is the guess too high, too low, or correct?");
            feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed it correctly.");
                break;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }

    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt((high - low) + 1) + low;
    }
}
