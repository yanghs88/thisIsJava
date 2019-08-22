package com.study.chapter17;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample1 {

    public static void main(String[] args) {

        List<Member> list = Arrays.asList(
                new Member("victor1", Member.MALE, 30),
                new Member("victor2", Member.FEMALE, 20),
                new Member("victor3", Member.MALE, 45),
                new Member("victor4", Member.FEMALE, 50)
        );

        double ageAvg = list.stream()
                        .filter(m -> m.getSex() == Member.MALE)
                        .mapToInt(Member::getAge)
                        .average()
                        .getAsDouble();

        System.out.println("남성 평균 연령은 ? " + ageAvg);
    }
}
