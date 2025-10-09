package telusko0921;

import java.time.*;

public class Telusko002DateTime {
    public static void main(String[] args) {
//        LocalDate
//        LocalDateTime
//        LocalTime
//        time package
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int dayOfYear = date.getDayOfYear();
        System.out.println(dayOfYear);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);

        int dayOfMonth = date.getDayOfMonth();
        System.out.println(dayOfMonth);

        int month = date.getMonthValue();
        System.out.println(month);

        System.out.println(dayOfMonth+"/"+month+"/"+date.getYear());

        LocalDate dob = LocalDate.of(1989,11,14);
        System.out.println(dob);

        System.out.println("********************************************");

        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour = time.getHour();
        int minutes = time.getMinute();
        System.out.println(hour+":"+minutes);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        ZoneId zoneId = ZoneId.of("America/New_York");

        ZonedDateTime newYorkTime = ZonedDateTime.now(zoneId);
        System.out.println(newYorkTime);

    }
}
