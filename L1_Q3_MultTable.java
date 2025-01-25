import java.util.Scanner;

public class L1_Q3_MultTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();
        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
            System.out.printf("%d * %d = %d\n", number, i , table[i-1]);
        }
    }
}
