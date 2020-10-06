package com.study.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<BrandPlanVO> list = new ArrayList<>();

        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");


        Random rand = new Random();

        int seq = 1;
        for(int i=1; i<=100; i++) {
            int randomValue = rand.nextInt(10000);

            LocalDateTime addDate = today.plusDays(seq);
            BrandPlanVO brandPlanVO = BrandPlanVO.builder()
                .no(randomValue)
                .state(30)
                .kind(1)
                .title("title" + i)
                .startDate("202006300000")
                .endDate(addDate.format(dateTimeFormatter))
                .siteKind(2)
                .seq(i)
                .build();
            list.add(brandPlanVO);
            seq++;
        }

        Collections.shuffle(list);


        List<BrandPlanVO> collect = list.stream()
            .sorted(Comparator.comparing(BrandPlanVO::getSeq)
                .thenComparing(Comparator.comparing(BrandPlanVO::getNo).reversed()))
//            .sorted(Comparator.comparing(BrandPlanVO::getSeq))
//            .sorted(Comparator.comparing(BrandPlanVO::getNo).reversed())
            .limit(20)
            .collect(Collectors.toList());

        
        collect.stream().
            forEach(s -> {
                System.out.println("s.toString() = " + s.toString());
                System.out.println("seq : " + s.getSeq() + ", no : " + s.getNo());

                System.out.println("startDate = " + s.getStartDate());

                LocalDateTime startDateTime = LocalDateTime
                    .parse(s.getStartDate(), DateTimeFormatter.ofPattern("yyyyMMddHHmm"));

                LocalDateTime endDateTime = LocalDateTime
                    .parse(s.getEndDate(), DateTimeFormatter.ofPattern("yyyyMMddHHmm"));

                /**
                 * 기본적으로 + 연산자를 쓰자.
                 * multithreaded 환경에서는 StringBuffer
                 * 반복문에서의 작업이나 다양한 문자열 작업 처리는 StringBuilder 또는 StringBuffer
                 */
                StringBuilder result = new StringBuilder();
                result.append(startDateTime.format(DateTimeFormatter.ofPattern("yy.MM.dd")));
                result.append(" ~ ");
                result.append(endDateTime.format(DateTimeFormatter.ofPattern("yy.MM.dd")));

//                String result = startDateTime.format(DateTimeFormatter.ofPattern("yy.MM.dd"))
//                    .concat(" ~ ")
//                    .concat(endDateTime.format(DateTimeFormatter.ofPattern("yy.MM.dd")));

                System.out.println(result);

            });

//        System.out.println("collect = " + collect);

    }
}
