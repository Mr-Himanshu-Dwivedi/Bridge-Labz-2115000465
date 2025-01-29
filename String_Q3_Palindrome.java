import java.util.Scanner;

public class String_Q3_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reversedInput = new StringBuilder(input).reverse().toString();
        if (input.equals(reversedInput))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
