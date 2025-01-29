import java.util.Scanner;

public class String_Q5_LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest word: " + longest);
    }
}
