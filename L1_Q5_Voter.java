import java.util.Scanner;

public class L1_Q5_Voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String ans = age >17?"The person can vote.":"The person cannot vote.";
        System.out.printf("Is the number %d divisible by 5? %s\n", age,ans);
    }
}
