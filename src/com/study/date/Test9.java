package com.study.date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Test9 {

    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.of(2022, 01, 10, 16, 59, 59);
        LocalDateTime t = a.truncatedTo(ChronoUnit.HOURS);
        System.out.println(t);
    }
}
