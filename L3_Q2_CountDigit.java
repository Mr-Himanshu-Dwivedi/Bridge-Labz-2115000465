import java.util.Scanner;

public class L3_Q2_CountDigit {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println("Number of digits are " + count);
    }

}
