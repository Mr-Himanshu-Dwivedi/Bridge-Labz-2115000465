import java.util.Scanner;

public class L1_Q18_MultTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number to get its multiplication table: ");
        int number = sc.nextInt();

        // Loop through numbers 6 to 9 to print the multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
    }
}
