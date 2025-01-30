import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] reversedArray = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            reversedArray[i] = input.charAt(input.length() - 1 - i);
        }
        String reversed = new String(reversedArray);
        System.out.println("Reversed String: " + reversed);
    }
}
