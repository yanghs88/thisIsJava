package com.study.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDiff {

    public static void main(String[] args) {

        String sdate = "202006300000";
        String edate = "202006301659";

        String dateFormat = "yyyyMMddHHmm";
        int length = dateFormat.length();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);
        LocalDateTime startDate = LocalDateTime.parse(sdate, dateTimeFormatter);
        LocalDateTime endDate = LocalDateTime.parse(edate, dateTimeFormatter);
        LocalDateTime now = LocalDateTime.now();

        System.out.println("now = " + now);

        boolean result = now.isAfter(startDate) && now.isBefore(endDate);

        System.out.println("result = " + result);

    }
}
