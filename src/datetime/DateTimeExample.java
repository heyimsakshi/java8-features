package datetime;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {

        /* Dates: */

        //Current Date:
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //Create Date:
        LocalDate localDate = LocalDate.of(2022, Month.JUNE, 12);
        System.out.println(localDate);

        /* Times: */

        //Current Time:
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //Create Time:
        LocalTime localTime = LocalTime.of(13, 28, 21);
        System.out.println(localTime);

        /* Date & Time: */

        //Current DateTime:
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Create DateTime:
        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.AUGUST, 12, 5, 23, 2);
        System.out.println(localDateTime);

        //Create DateTime From Previous Date & Time:
        LocalDateTime previous = LocalDateTime.of(currentDate, currentTime);
        System.out.println(previous);

        /* Zoned Date Time: */

        //Get All The Zones:
//        for(String zone : ZoneId.getAvailableZoneIds()){
//            System.out.println(zone);
//        }

        // Current ZonedDateTime:
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        System.out.println(currentZonedDateTime);

        // Create ZonedDateTime:
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Tokyo"));
        System.out.println(zonedDateTime);

        //Get The Zone:
        System.out.println(zonedDateTime.getZone());

        /* Common Methods:(Applicable For All Classes{LocalDate, LocalTime, LocalDateTime, ZonedDateTime}) */
        LocalDateTime returnedDateTime = localDateTime.plusYears(5);
//        LocalDateTime returnedDateTime = localDateTime.plusMonths(5);
//        LocalDateTime returnedDateTime = localDateTime.plusDays(15);
//        LocalDateTime returnedDateTime = localDateTime.plusHours(5);
//        LocalDateTime returnedDateTime = localDateTime.plusMinutes(50);
//        LocalDateTime returnedDateTime = localDateTime.plusSeconds(52);

        System.out.println(returnedDateTime);


        /* Printing
        Year,
        Month,
        Day,
        Hours,
        Minutes,
        Seconds:
        (Applicable For All Classes{LocalDate, LocalTime, LocalDateTime, ZonedDateTime})*/
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        /* DateTime Formatter: */

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy:hh:mm:ss");
        System.out.println(localDateTime.format(formatter));

        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd.MM.yy 'Hi There' : hh:mm:ss");
        System.out.println("Custom Format: " + localDateTime.format(customFormatter));

        //Print Only Date:
        DateTimeFormatter onlyDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Only Date: " + localDateTime.format(onlyDate));

        //Print Only Date:
        DateTimeFormatter onlyTime = DateTimeFormatter.ofPattern("hh.mm.ss");
        System.out.println("Only Date: " + localDateTime.format(onlyTime));

        /* Period & Duration: */

        //Period:
        LocalDate birthDate = LocalDate.of(2000, 3, 8);
        LocalDate now = LocalDate.now();
        Period period = Period.between(birthDate, now);
        System.out.println("My Age = " + period.getYears());
//        System.out.println(period.getMonths());
//        System.out.println(period.getDays());

        //Duration:
        LocalTime time1 = LocalTime.now();
        System.out.println("Current Time = " + time1);

        Duration fiveHoursDuration = Duration.ofHours(5);

        LocalTime time2 = time1.plus(fiveHoursDuration);
        System.out.println("After Adding 5 Hours = " + time2);

        Duration gap = Duration.between(time1, time2);
        System.out.println("Difference Between time1 & time2 = " + gap.toHours() + " Hours And " + gap.toMinutes() + " Minutes And " + gap.toSeconds() + " Seconds.");
    }
}
