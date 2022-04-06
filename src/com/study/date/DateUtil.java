package com.study.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class DateUtil {
    // FIXME DateTimeFormatter 에 static 으로 잡혀있는것들을 사용한다. 그 중에 없다면 FORMAT 만들어서 사용하자!
    public static final String FORMAT_DATE_MIN = "yyyyMMdd";
    public static final String FORMAT_DATE_TIME_MIN = "yyyyMMddHH";
    public static final String FORMAT_YYYYMMDDHHMM = "yyyyMMddHHmm";
    public static final String FORMAT_DATE_TIME_MIN_SEC = "yyyyMMddHHmmss";
    public static final String FORMAT_YYYYMMDD = "yyyy-MM-dd";
    public static final String FORMAT_YYYYMMDD_HHMMSS = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_YYYYMMDD_DOT = "yyyy.MM.dd";

    public static final String FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmm00";

    public static final String LOCAL_TIME_ZONE = "Asia/Seoul";
    public static final ZoneOffset ZONE_OFFSET_KST = ZoneOffset.of("+09:00");

    public static LocalDate toLocalDate(String strDate, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(strDate, formatter);
    }

    public static LocalDateTime toLocalDateTime(String strDate, String format) {
        if (Objects.isNull(strDate)) {
            return null;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(strDate, formatter);
    }

    public static LocalDateTime toLocalDateTimeWithoutException(String date, String fmt) {
        try {
            return toLocalDateTime(date, fmt);
        } catch (Exception e) {
            // IllegalArgumentException ||  DateTimeParseException
            return null;
        }
    }

    public static LocalDateTime toLocalDateTimeWithoutException(long epochSecond) {
        try {
            return LocalDateTime.ofInstant(Instant.ofEpochSecond(epochSecond), ZoneId.of(LOCAL_TIME_ZONE));
        } catch (Exception e) {
            // DateTimeException
            return null;
        }
    }

    public static LocalDateTime now() {
        return LocalDateTime.now(ZoneId.of(LOCAL_TIME_ZONE));
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

    public static String convertPastDateTime(LocalDateTime dateTime) {
        return convertPastDateTime(dateTime, null, null);
    }

    public static String convertPastDateTime(LocalDateTime dateTime, String pattern, Integer daysLimit) {
        Duration dateDiff = Duration.between(dateTime, LocalDateTime.now());

        if (Objects.nonNull(daysLimit) && Objects.nonNull(pattern) && dateDiff.toDays() > daysLimit) {
            return convert(dateTime, pattern);
        }

        if (dateDiff.toDays() > 0) {
            return dateDiff.toDays() + "일 전";
        }

        if (dateDiff.toHours() > 0) {
            return dateDiff.toHours() + "시간 전";
        }

        if (dateDiff.toMinutes() > 0) {
            return dateDiff.toMinutes() + "분 전";
        }

        return "1분 전";
    }

    public static boolean isBetweenDate(LocalDateTime searchDate, LocalDateTime startDate, LocalDateTime endDate) {
        return (!searchDate.isBefore(startDate)) && (searchDate.isBefore(endDate));
    }

    public static Long convertEpochMilli(LocalDateTime date) {
        return Objects.nonNull(date) ? date.toInstant(ZONE_OFFSET_KST).toEpochMilli() : null;
    }

}