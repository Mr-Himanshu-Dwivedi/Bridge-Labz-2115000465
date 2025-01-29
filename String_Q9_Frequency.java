import java.util.Scanner;

public class String_Q9_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }
        char mostFrequent = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (freq[input.charAt(i)] > freq[mostFrequent]) {
                mostFrequent = input.charAt(i);
            }
        }
        System.out.printf("Most Frequent Character: '%c'\n", mostFrequent);
    }
}
