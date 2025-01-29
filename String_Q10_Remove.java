import java.util.Scanner;

public class String_Q10_Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char removeChar = sc.nextLine().charAt(0);
        String result = input.replaceAll(String.valueOf(removeChar), "");
        System.out.println("Modified String: " + result);
    }
}
