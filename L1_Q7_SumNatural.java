import java.util.Scanner;
public class L1_Q7_SumNatural {
    public static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.printf("Sum of natural number is : %d",(sum(num)));
    }
}
