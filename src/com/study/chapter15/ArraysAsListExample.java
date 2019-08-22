package com.study.chapter15;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("AAA", "BBB", "CCC");

        for (String name : list) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(1,2,3,4,5);

        for (int value : list2) {
            System.out.println(value);
        }
    }
}
