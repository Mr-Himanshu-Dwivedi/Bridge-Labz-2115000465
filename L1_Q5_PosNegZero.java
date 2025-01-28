import java.util.*;
public class L1_Q5_PosNegZero {
    public static int check(int n){
        //Both functions works same
        //return (n>0?1:n<0?-1:0);
        return (Integer.compare(n, 0));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int result= check(n);
        System.out.println(result);
    }
}
