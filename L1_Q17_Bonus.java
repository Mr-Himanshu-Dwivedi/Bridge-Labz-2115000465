import java.util.Scanner;

public class L1_Q17_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take salary and years of service as input
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the number of years of service: ");
        int yearsOfService = sc.nextInt();

        // Calculate bonus based on years of service
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        // Print the bonus amount
        System.out.printf("The bonus for the employee is: %.2f\n", bonus);
    }
}
