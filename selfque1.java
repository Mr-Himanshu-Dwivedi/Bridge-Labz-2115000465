import java.util.Scanner;
public class selfque1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double ti = sc.nextDouble();
        double simple_Interest = (p * rate * ti) / 100;
        System.out.println("Simple Interest: " + simple_Interest);
    }
}