package com.study.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Test5 {

    public static void main(String[] args) {

        LocalDateTime now = DateUtil.now();
        LocalDateTime yesterday = now.minusDays(1);

        System.out.println("yesterday = " + yesterday);
        System.out.println("now = " + now);

        LocalDate localDate = yesterday.toLocalDate();
        System.out.println("localDate = " + localDate);

        LocalDateTime localDateTime = localDate.atTime(0, 0, 0);
        System.out.println("localDateTime = " + localDateTime);


    }
}
