import java.util.Scanner;

public class L3_Q6_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }

}
