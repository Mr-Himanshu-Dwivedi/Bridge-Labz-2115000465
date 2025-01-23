import java.util.Scanner;

public class L1_Q4_NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.printf(number>1?("The sum of %d natural numbers is %s"):("The number %d is not a natural number"),number,(number*(number+1))/2);
    }
}
