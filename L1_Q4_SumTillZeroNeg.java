import java.util.Scanner;

public class L1_Q4_SumTillZeroNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            if (number <= 0 || index == 9) {
                values[index] = number;
                break;
            }

            values[index] = number;
            index++;
        }

        System.out.println("Entered values:");
        for (double num : values) {
            System.out.printf("%.2f ", num);
            total += num;
        }

        System.out.printf("\nTotal: %.2f\n", total);
    }
}
