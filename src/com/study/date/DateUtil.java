package com.study.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class DateUtil {
    public static final String FORMAT_DATE_MIN = "yyyyMMdd";
    public static final String FORMAT_DATE_TIME_MIN = "yyyyMMddHH";
    public static final String LOCAL_TIME_ZONE = "Asia/Seoul";

    public static LocalDate toLocalDate(String strDate, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(strDate, formatter);
    }

    public static LocalDateTime toLocalDateTime(String strDate, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(strDate, formatter);
    }

    public static LocalDateTime now() {
        return LocalDateTime.now(ZoneId.of(LOCAL_TIME_ZONE));
    }

    public static LocalDate nowLocalDate() {
        return LocalDate.now(ZoneId.of(LOCAL_TIME_ZONE));
    }

    public static LocalDate yesterdayLocalDate() {
        return LocalDate.now(ZoneId.of(LOCAL_TIME_ZONE)).minusDays(1);
    }

    public static String nowLocalDateToString(String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return now().format(formatter);
    }

    public static LocalDate getLocalDate(String date) {
        String[] temp = date.split("-");
        if (temp.length < 2) {
            return LocalDate.parse(date);
        }
        return LocalDate.of(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
    }

    public static String convertDateTimeWithDefault(LocalDateTime dateTime, String defaultValue) {
        return Objects.isNull(dateTime) ? defaultValue : convert(dateTime, "yyyyMMddHHmm");
    }

    public static String convert(LocalDateTime dateTime, String pattern) {
        return Objects.isNull(dateTime) ? "" : DateTimeFormatter.ofPattern(pattern).format(dateTime);
    }

    public static boolean isBetweenDate(LocalDateTime searchDate, LocalDateTime startDate, LocalDateTime endDate) {
        return (!searchDate.isBefore(startDate)) && (searchDate.isBefore(endDate));
    }
}
