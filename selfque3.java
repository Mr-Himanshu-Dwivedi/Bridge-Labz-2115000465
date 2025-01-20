import java.util.Scanner;
public class selfque3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double e = scanner.nextDouble();
        double res = Math.pow(base, e);
        System.out.println("Result =  " + res);
    }
}