import java.util.Scanner;

public class Extras_Q7_GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int calculateGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int calculateLCM(int num1, int num2, int gcd) {
        return (num1 * num2) / gcd;
    }
}
