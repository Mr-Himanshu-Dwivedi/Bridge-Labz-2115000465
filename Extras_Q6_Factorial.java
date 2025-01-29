import java.util.Scanner;

public class Extras_Q6_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = getInput();

        int result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }
}