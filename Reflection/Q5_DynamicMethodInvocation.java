import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class Q5_DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation (add, subtract, multiply): ");
        String operation = sc.nextLine();

        MathOperations mathOperations = new MathOperations();
        Method method = MathOperations.class.getDeclaredMethod(operation, int.class, int.class);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = (int) method.invoke(mathOperations, a, b);
        System.out.println("Result: " + result);
    }
}
