package com.study.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StreamTest2 {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        items.add("MUSINSA");
        items.add("WUSINSA");
        items.add("PLAYER");
        items.add("OUTLET");

        boolean musinsa = items.contains("MUSINSA");

        System.out.println("musinsa = " + musinsa);
        

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
        LocalDateTime test = LocalDateTime.parse("2020-08-11T14:59:00.000Z", dateTimeFormatter);
        System.out.println("test.toString() = " + test.getHour());

    }
}
