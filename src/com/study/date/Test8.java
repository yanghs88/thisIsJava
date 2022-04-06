package com.study.date;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Test8 {

    public static void main(String[] args) {

//        LocalDateTime localDateTime = DateUtil.now().withSecond(0).withNano(0);
//        long timestamp = Timestamp.valueOf(localDateTime).getTime();
//        System.out.println("localDateTime = " + localDateTime);
//        System.out.println("timestamp = " + timestamp);
//
//        long timestamp2 = Timestamp.valueOf(DateUtil.now()).getTime();
//        System.out.println("timestamp2 = " + timestamp2);
//
//        Instant instant = Instant.ofEpochMilli(1641798292000L);
//        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant, ZoneId.of("Asia/Seoul"));
//
//        System.out.println("result = " + localDateTime1);
//
//        LocalDateTime localDateTime2 = localDateTime.truncatedTo(ChronoUnit.SECONDS);
//
//        System.out.println("localDateTime2 = " + localDateTime2);

        LocalDateTime localDateTime = DateUtil.now().truncatedTo(ChronoUnit.MINUTES);

//        System.out.println("localDateTime = " + localDateTime);
//        long timestamp = Timestamp.valueOf(localDateTime).getTime();
        long timestamp = 1643159100000L;

        System.out.println("timestamp.getTime() = " + timestamp);

        Instant instant = Instant.ofEpochMilli(timestamp);
        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(instant, ZoneId.of("Asia/Seoul"));
        System.out.println("localDateTime2 = " + localDateTime2);


    }
}
