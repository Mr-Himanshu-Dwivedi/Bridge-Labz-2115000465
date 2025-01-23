import java.util.Scanner;

public class L1_Q6_CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = n>0?"positive":n<0?"negative":"zero";
        System.out.println(ans);
    }
}
