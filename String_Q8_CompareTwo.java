import java.util.Scanner;

public class String_Q8_CompareTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        if (input1.equals(input2)) {
            System.out.println("Both strings are equal");
        } else if (input1.compareTo(input2) < 0) {
            System.out.println(input1 + " comes before " + input2 + " in lexicographical order");
        } else {
            System.out.println(input1 + " comes after " + input2 + " in lexicographical order");
        }
    }
}
