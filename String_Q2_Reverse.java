import java.util.Scanner;

public class String_Q2_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        System.out.println("Reversed String: " + reversed);
    }
}
