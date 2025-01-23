import java.util.Scanner;

public class L1_Q3_Check3Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nos");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        String ans1 = (number1 < number2)&&(number1 < number3)?"Yes":"No";
        String ans2 = (number2 < number1)&&(number2 < number3)?"Yes":"No";
        String ans3 = (number3 < number1)&&(number3 < number2)?"Yes":"No";

        System.out.printf("Is the first number the smallest? %s\n", ans1);
        System.out.printf("Is the second number the smallest? %s\n", ans2);
        System.out.printf("Is the third number the smallest? %s\n", ans3);
    }
}
