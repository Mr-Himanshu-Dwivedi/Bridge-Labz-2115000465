import java.util.Scanner;

public class L2_Q3_DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in decimal or int format");
        System.out.print("Enter value for a: ");
        double a=sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b=sc.nextDouble();
        System.out.print("Enter value for c: ");
        double c=sc.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

    }
}
