import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Dates {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime myDateTime = LocalDateTime.now();

        System.out.println(myDate);
        System.out.println(myTime);
        System.out.println(myDateTime);

        DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String formattedDateTime = myDateTime.format(myDateTimeFormatter);

        System.out.println(formattedDateTime);
    }
}
