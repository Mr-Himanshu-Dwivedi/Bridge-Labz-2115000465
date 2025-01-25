import java.util.Scanner;

public class L1_Q5_Mutl6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int[] result = new int[4];

        for (int i = 6,a=0; i <= 9; i++) {
            result[a++] = number * i;
        }

        System.out.println("Multiplication table for " + number + ":");
        for (int i = 6,a=0; i <=9; i++) {
            System.out.printf("%d * %d = %d\n", number, i, result[a++]);
        }
    }
}
