import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeForma;
import java.time.temporal.ChronoUnit;

public class Java8TimeZoneConversion {

    public static void main(String[] args) {

        ZonedDateTime currentDateTime = ZonedDateTime.now();

       
        ZoneId NewYork = ZoneId.of("America/New_York");
        ZoneId LondonTimeZone = ZoneId.of("Europe/London");
        ZoneId TokyoTimeZone = ZoneId.of("Asia/Tokyo");
        ZoneId SydneyTimeZone = ZoneId.of("Australia/Sydney");

       
        ZonedDateTime NewyorkDateTime = currentDateTime.withZoneSameIn(NewYork);

       
        ZonedDateTime LondonDateTime = currentDateTime.withZoneSameIn(LondonTimeZone);

        ZonedDateTime TokyoDateTime = currentDateTime.withZoneSameIn(TokyoTimeZone);
        ZonedDateTime SydneyDateTime = currentDateTime.withZoneSameIn(SydneyTimeZone);

       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern();
       
       
        System.out.println("Current time in IST : " + formatter.format(currentDateTi));
        System.out.println("NewYork time now : " + formatter.format(NewyorkDateTi));
        System.out.println("London time now : " + formatter.format(LondonDateTim));
        System.out.println("Tokyo time now : " + formatter.format(TokyoDateTime));
        System.out.println("Sydney time now : " + formatter.format(SydneyDateTim));
    }
}