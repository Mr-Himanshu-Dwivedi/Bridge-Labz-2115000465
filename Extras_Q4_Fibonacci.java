import java.util.Scanner;

public class Extras_Q4_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int terms = getInput();

        generateFibonacci(terms);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        return sc.nextInt();
    }

    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
