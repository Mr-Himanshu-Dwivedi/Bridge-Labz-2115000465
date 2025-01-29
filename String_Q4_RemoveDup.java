import java.util.Scanner;

public class String_Q4_RemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (result.indexOf(String.valueOf(input.charAt(i))) == -1) {
                result.append(input.charAt(i));
            }
        }
        System.out.println("String without duplicates: " + result);
    }
}
