import java.util.Scanner;

public class Extras_Q5_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = getInput();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
