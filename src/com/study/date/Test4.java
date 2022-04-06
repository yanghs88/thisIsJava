package com.study.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test4 {

    public static void main(String[] args) {

        LocalDate date =  LocalDate.of(2021, 06, 30);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime.toLocalDate() = " + localDateTime.toLocalDate());

        LocalDateTime convertDate = LocalDateTime.of(date, LocalTime.of(0, 0));

        System.out.println("convertDate = " + convertDate);

    }

}
