import java.util.Scanner;

public class L2_Q7_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();


        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;


        System.out.println("The swapped numbers are " + n1 + " and " + n2);
    }

}
