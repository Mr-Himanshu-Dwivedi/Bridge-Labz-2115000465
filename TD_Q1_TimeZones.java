import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TD_Q1_TimeZones {
    public static void main(String[] args) {
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.printf("Current time in GMT: %s\n", gmtTime.format(formatter));
        System.out.printf("Current time in IST: %s\n", istTime.format(formatter));
        System.out.printf("Current time in PST: %s\n", pstTime.format(formatter));
    }
}
