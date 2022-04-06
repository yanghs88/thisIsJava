package com.study.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOrderTest2 {

    public static void main(String[] args) {

        List<Integer> score = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        final List<Integer> collect = score.stream()
            .limit(5)
            .sorted(Comparator.reverseOrder())

            .collect(Collectors.toList());

        System.out.println("collect = " + collect.toString());


    }
}
