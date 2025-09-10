package Fundamentals.DateTimeProject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today); // Without any format, it gets outputted as yyyy-mm-dd

        LocalDate Five5 = LocalDate.of(2022, 5, 5);
        System.out.println(Five5);

        LocalDate May5th = LocalDate.of(2022, Month.MAY, 5);
        System.out.println(May5th);

        LocalDate Day125 = LocalDate.ofYearDay(2022, 125); // Uses the 1 - 365 as the month/day
        System.out.println(Day125);

        LocalDate May5 = LocalDate.parse("2022-05-05"); // String
        System.out.println(May5);

        System.out.println(May5.getYear()); // Integer
        System.out.println(May5.getMonth()); // Enum constant, all caps

        System.out.println(May5.getMonthValue());
        System.out.println(May5.getDayOfWeek()); // On a THURSDAY enum constant
        System.out.println(May5.getDayOfYear()); // 125 is May 5th

        System.out.println(May5.get(ChronoField.YEAR)); // year
        System.out.println(May5.get(ChronoField.MONTH_OF_YEAR)); // 5th month of the year
        System.out.println(May5.get(ChronoField.DAY_OF_MONTH)); // 5th day of the month
        System.out.println(May5.get(ChronoField.DAY_OF_YEAR)); // 125 day of the 365 days in a year

        // These changes don't change May5 variable
        System.out.println(May5.withYear(2000));
        System.out.println(May5.withMonth(3));
        System.out.println(May5.withDayOfMonth(4));
        System.out.println(May5.withDayOfYear(126));

        System.out.println(May5.with(ChronoField.DAY_OF_YEAR, 126));

        System.out.println(May5.plusYears(1));
        System.out.println(May5.plusMonths(12));
        System.out.println(May5.plusDays(365));
        System.out.println(May5.plusWeeks(52));

        System.out.println("May5 > today " + May5.isAfter(today));
        System.out.println("today > May5 " + May5.isBefore(today));
        System.out.println("May5 > today " + May5.compareTo(today));
        System.out.println("today > May5 " + today.compareTo(May5));

        System.out.println(today.isLeapYear());

        System.out.println("-----------------------");
        May5.datesUntil(May5.plusDays(7))
                .forEach(System.out::println);

        LocalTime time = LocalTime.now();
        System.out.println(time); // Uses military time

        LocalTime sevenAM = LocalTime.of(7, 0);
        System.out.println(sevenAM);

        LocalTime sevenThirty = LocalTime.of(7, 30, 15);
        System.out.println(sevenThirty);

        LocalTime sevenPM = LocalTime.parse("19:00");
        LocalTime sevenThirtyPM = LocalTime.parse("19:30:15.1000");

        System.out.println(sevenPM);
        System.out.println(sevenThirtyPM);

        LocalTime seven = LocalTime.parse("07:00");
        System.out.println(seven);

        System.out.println(seven.get(ChronoField.AMPM_OF_DAY)); // 0 for am
        System.out.println(sevenThirtyPM.get(ChronoField.AMPM_OF_DAY)); // 1 for pm

        System.out.println(sevenThirtyPM.getHour());
        System.out.println(sevenThirtyPM.get(ChronoField.HOUR_OF_DAY));

        System.out.println(sevenThirtyPM.plus(24, ChronoUnit.HOURS));

        System.out.println(sevenPM.range(ChronoField.HOUR_OF_DAY));

        System.out.println(sevenPM.range(ChronoField.MINUTE_OF_HOUR));
        System.out.println(sevenPM.range(ChronoField.MINUTE_OF_DAY));
        System.out.println(sevenPM.range(ChronoField.SECOND_OF_MINUTE));
        System.out.println(sevenPM.range(ChronoField.SECOND_OF_DAY));

        LocalDateTime todayAndNow = LocalDateTime.now(); // Date T Time
        System.out.println(todayAndNow);

        LocalDateTime May5Noon = LocalDateTime.of(2022, 5, 5, 12, 0);

        System.out.printf("%tD %tr %n", May5Noon, May5Noon); //
        System.out.printf("%1$tF %1$tT %n", May5Noon);

        System.out.println(todayAndNow.format(DateTimeFormatter.ISO_WEEK_DATE));

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(May5Noon.format(dtf));

        System.out.println(May5Noon.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
    }
}
