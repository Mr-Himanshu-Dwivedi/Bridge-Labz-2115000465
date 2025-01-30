import java.util.Scanner;

public class StringRemoveDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (result.indexOf(String.valueOf(input.charAt(i))) == -1) {
                result += input.charAt(i);
            }
        }
        System.out.println("String without duplicates: " + result);
    }
}
