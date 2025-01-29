import java.time.LocalDate;
import java.util.Scanner;

public class TD_Q4_DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateStr = sc.nextLine();
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateStr = sc.nextLine();

        LocalDate firstDate = LocalDate.parse(firstDateStr);
        LocalDate secondDate = LocalDate.parse(secondDateStr);

        if (firstDate.isBefore(secondDate)) {
            System.out.printf("%s is before %s\n", firstDate, secondDate);
        } else if (firstDate.isAfter(secondDate)) {
            System.out.printf("%s is after %s\n", firstDate, secondDate);
        } else {
            System.out.printf("%s is the same as %s\n", firstDate, secondDate);
        }
    }
}
