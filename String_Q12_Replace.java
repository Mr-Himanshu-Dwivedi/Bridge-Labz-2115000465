import java.util.Scanner;

public class String_Q12_Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();
        String result = input.replace(oldWord, newWord);
        System.out.println("Modified Sentence: " + result);
    }
}
