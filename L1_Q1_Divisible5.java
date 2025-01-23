import java.util.Scanner;

public class L1_Q1_Divisible5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = n%5==0?"Yes":"No";
        System.out.printf("Is the number %d divisible by 5? %s\n",n,ans);
    }
}
