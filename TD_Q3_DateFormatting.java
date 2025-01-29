import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TD_Q3_DateFormatting {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.printf("Current date in dd/MM/yyyy format: %s\n", currentDate.format(format1));
        System.out.printf("Current date in yyyy-MM-dd format: %s\n", currentDate.format(format2));
        System.out.printf("Current date in EEE, MMM dd, yyyy format: %s\n", currentDate.format(format3));
    }
}
