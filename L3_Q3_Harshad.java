import java.util.Scanner;

public class L3_Q3_Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        if (m % sum == 0) {
            System.out.println("Harshad number");
        } else {
            System.out.println("Not a Harshad number");
        }
    }
}
