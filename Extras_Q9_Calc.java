import java.util.Scanner;

public class Extras_Q9_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");

        System.out.println("Select operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static int getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return (double) a / b;
    }
}
