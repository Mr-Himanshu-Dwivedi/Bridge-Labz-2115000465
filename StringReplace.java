import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();

        String result = "";
        int i = 0;

        while (i < input.length()) {
            if (i + oldWord.length() <= input.length() && input.substring(i, i + oldWord.length()).equals(oldWord)) {
                result += newWord;
                i += oldWord.length();
            } else {
                result += input.charAt(i);
                i++;
            }
        }

        System.out.println("Modified Sentence: " + result);
    }
}
