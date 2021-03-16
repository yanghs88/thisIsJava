package com.study.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDiff {

    public static void main(String[] args) {

//        String sdate = "202006300000";
//        String edate = "202006301659";
//
//        String dateFormat = "yyyyMMddHHmm";
//        int length = dateFormat.length();
//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);
//        LocalDateTime startDate = LocalDateTime.parse(sdate, dateTimeFormatter);
//        LocalDateTime endDate = LocalDateTime.parse(edate, dateTimeFormatter);
//        LocalDateTime now = LocalDateTime.now();
//
//        System.out.println("now = " + now);
//
//        boolean result = now.isAfter(startDate) && now.isBefore(endDate);
//
//        System.out.println("result = " + result);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime regiDate = LocalDateTime.parse("2020-12-18T17:04:38");

        Duration dateDiff = Duration.between(regiDate, now);

        System.out.println("dateDiff = " + dateDiff);
        System.out.println("dateDiff = " + dateDiff.toDays());

    }
}
