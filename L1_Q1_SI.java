import java.util.Scanner;

public class L1_Q1_SI {

    public static double SI(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double Principle = sc.nextDouble();
        System.out.print("Enter the Rate of Interest (in %): ");
        double Rate = sc.nextDouble();
        System.out.print("Enter the Time period (in years): ");
        double Time = sc.nextDouble();

        double simpleInterest = SI(Principle, Rate, Time);

        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f%% and Time %.2f years.%n",simpleInterest, Principle, Rate, Time);
    }
}