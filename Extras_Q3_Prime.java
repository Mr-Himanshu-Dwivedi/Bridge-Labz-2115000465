import java.util.Scanner;

public class Extras_Q3_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = getInput();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
