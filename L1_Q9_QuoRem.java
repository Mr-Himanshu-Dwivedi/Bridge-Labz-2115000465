import java.util.Scanner;
public class L1_Q9_QuoRem {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder=number%divisor;
        int res[]=new int[2];
        res[0]=quotient;
        res[1]=remainder;
        return res;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(dividend, divisor);
        System.out.printf("Quotient is %d and Remainder is %d",result[0],result[1]);
        sc.close();
    }
    
}
