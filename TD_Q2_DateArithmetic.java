import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TD_Q2_DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 1, 1); // Example input date
        LocalDate result = inputDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.printf("Original date: %s\n", inputDate.format(formatter));
        System.out.printf("Result after adding 7 days, 1 month, 2 years and subtracting 3 weeks: %s\n", result.format(formatter));
    }
}
