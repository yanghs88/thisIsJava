package com.study.date;

import java.time.LocalDateTime;

public class Test2 {

    public static void main(String[] args) {

        System.out.println("now = " + DateUtil.now().toString());

        LocalDateTime startDate = LocalDateTime.of(2020, 8, 05, 9, 00);
        LocalDateTime endDate = LocalDateTime.of(2020, 8, 06, 23, 59);

        PeriodEnum periodEnum = PeriodEnum.find(startDate, endDate);

        System.out.println("periodEnum.toString() = " + periodEnum.toString());

        boolean betweenDate = DateUtil.isBetweenDate(DateUtil.now(), startDate, endDate);

        System.out.println("betweenDate = " + betweenDate);

        System.out.println("PeriodEnum.WAITING.name() = " + PeriodEnum.WAITING.name());
    }
}
