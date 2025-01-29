import java.util.Scanner;

public class String_Q7_ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder toggled = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch);
            }
        }
        System.out.println("Toggled Case: " + toggled);
    }
}
