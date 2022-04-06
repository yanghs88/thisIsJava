package com.study.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test7 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2012, 9, 01);
        LocalDate now = LocalDate.now();

        long workMonth = ChronoUnit.MONTHS.between(start, now);

        System.out.println("근무개월 : " + workMonth);
        System.out.println("연차(반올림) : " + Math.round(workMonth / 12));
    }
}
