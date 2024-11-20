package java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.Clock;

public class DateTimeExample {
    public static void main(String[] args) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("d/MM/yyyy hh:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(format1));

        Clock americaClock = Clock.system(ZoneId.of("America/New_York"));
        System.out.println(americaClock.instant().atZone(americaClock.getZone()).format(format1));
    }
}
