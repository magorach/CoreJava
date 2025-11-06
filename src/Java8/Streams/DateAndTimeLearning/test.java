package Java8.Streams.DateAndTimeLearning;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class test {
    public static void main(String[] args) throws InterruptedException {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        
        //custom date
        LocalDate customDate = LocalDate.of(2000, 12, 25);


        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);

        LocalDate pastDate = today.minusMonths(10);
        System.out.println(pastDate);

        if (today.isAfter(pastDate )){
            System.out.println("Yes bhai");
        }


        //-------------------------------------------------------------------------------------
        LocalTime now1 = LocalTime.now();
        System.out.println(now1);
        LocalTime customTime = LocalTime.of(14, 30, 2);
        LocalTime parsedTime = LocalTime.parse("15:11:45");
        LocalTime beforeOneHour = now1.minusHours(1);
        System.out.println(beforeOneHour);
        
        //-------------------------------------------------------------------------------------
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2);
        LocalDateTime parse = LocalDateTime.parse("2025-01-11T13:48");
        DayOfWeek dayOfWeek = parse.getDayOfWeek();
        System.out.println(dayOfWeek);


        //-------------------------------------------------------------------------------------
        ZonedDateTime indiaTime = ZonedDateTime.now();
        System.out.println("Current time zone of India : "+indiaTime);       ///2025-11-03T17:38:23.580639500+05:30[Asia/Calcutta]
//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//        availableZoneIds.stream().forEach(System.out::println);
        ZonedDateTime customZonedDateAndTime = ZonedDateTime.of(2000, 12, 1, 14, 30, 30, 30, ZoneId.of("America/New_York"));
        System.out.println(customZonedDateAndTime);
        System.out.println(" ---------------");
        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time zone of NewYork : "+newYork);


        System.out.println("---------------------------------------------------------------------");
        long cur = System.currentTimeMillis();
        System.out.println(cur);
        Instant now3 = Instant.now();
        System.out.println(now3);
          //------------------------------------------------------------------------------------

        Instant start =  Instant.now();
        int sum=0;
        for (int i = 0; i <100000000 ; i++) {
            sum = sum+i+1;
        }
        Instant end = Instant.now();
        Duration d1 = Duration.between(start,end);

        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d1);

        System.out.println(d2);

        LocalDateTime a = LocalDateTime.now();
        Thread.sleep(2000);
        LocalDateTime b = LocalDateTime.now();
        Duration duration1 = Duration.between(a, b);
        System.out.println(duration1);

        System.out.println("----------------------------------------------------");
        LocalDate now4 = LocalDate.now();
        LocalDate oldDate = LocalDate.of(1990, 2, 2);
        Period p1 = Period.between(now4, oldDate);
        System.out.println(p1);


        System.out.println("---------------------------------------------------");
        String s= "25/04/2022";
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parse1 = LocalDate.parse(s,myFormat);
        System.out.println(parse1);


    }
}
