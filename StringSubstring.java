import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String substring = sc.nextLine();
        int count = 0;
        int index = 0;
        while ((index = input.indexOf(substring, index)) != -1) {
            count++;
            index++;
        }
        System.out.printf("Substring occurrences: %d\n", count);
    }
}
