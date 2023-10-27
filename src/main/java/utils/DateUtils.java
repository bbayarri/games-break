package utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static LocalDate parseStringToLocalDate(String dateString) {
        try {
            return LocalDate.parse(dateString, dateFormatter);
        } catch (Exception e) {
            return null;
        }
    }

    public static LocalTime parseStringToLocalTime(String timeString) {
        try {
            return LocalTime.parse(timeString, timeFormatter);
        } catch (Exception e) {
            return null;
        }
    }

    public static LocalDateTime convertToLocalDateTime(Date dateToConvert) {
        Instant instant = dateToConvert.toInstant();
        return instant.atZone(java.time.ZoneId.systemDefault()).toLocalDateTime();
    }

    public static LocalDate convertToLocalDate(Date dateToConvert) {
        Instant instant = dateToConvert.toInstant();
        return instant.atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalTime convertToLocalTime(Date dateToConvert) {
        Instant instant = dateToConvert.toInstant();
        return instant.atZone(java.time.ZoneId.systemDefault()).toLocalTime();
    }
}

