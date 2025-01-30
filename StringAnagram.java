import java.util.*;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        if (input1.length() != input2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] count1 = new int[256];  // Assuming ASCII characters
        int[] count2 = new int[256];  // Assuming ASCII characters

        for (int i = 0; i < input1.length(); i++) {
            count1[input1.charAt(i)]++;
            count2[input2.charAt(i)]++;
        }

        boolean isAnagram = true;
        for (int i = 0; i < 256; i++) {
            if (count1[i] != count2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
