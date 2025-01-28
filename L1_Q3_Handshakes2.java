import java.util.Scanner;
public class L1_Q3_Handshakes2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int n=sc.nextInt();
        int maxHand=(n*(n-1))/2;
        System.out.printf("number of possible handshakes : %d",maxHand);
    }
}
