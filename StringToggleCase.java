import java.util.Scanner;

public class StringToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String toggled = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                toggled += (char) (ch + 'a' - 'A');
            } else if (ch >= 'a' && ch <= 'z') {
                toggled += (char) (ch - 'a' + 'A');
            } else {
                toggled += ch;
            }
        }

        System.out.println("Toggled Case: " + toggled);
    }
}
