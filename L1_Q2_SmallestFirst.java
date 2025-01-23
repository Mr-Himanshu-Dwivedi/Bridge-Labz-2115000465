import java.util.Scanner;

public class L1_Q2_SmallestFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nos");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        String ans = (number1 < number2)&&(number1 < number3)?"Yes":"No";
        System.out.printf("Is the first number the smallest? %s\n",ans);
    }
}
