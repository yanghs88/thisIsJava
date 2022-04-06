package com.study.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListOrderTest {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        nums.add(12);
        nums.add(13);
        nums.add(14);
        nums.add(15);
        nums.add(16);
        nums.add(17);
        nums.add(18);
        nums.add(19);
        nums.add(20);

//        List<Integer> printNums = new ArrayList<>(10);
//        printNums.add(nums.get(0));
//        printNums.add(nums.get(1));

        // bad case -> 원본객체를 참조한다. 주의
        final List<Integer> splitList = nums.subList(2, nums.size());
        // goods case
        final ArrayList<Integer> splitList2 = new ArrayList<>(nums.subList(2, nums.size()));

        // 셔플
        Collections.shuffle(splitList);

//        final List<Integer> collect = nums.stream().limit(10).collect(Collectors.toList());
//        System.out.println("collect.toString() = " + collect.toString());

        /*if (splitList.size() > 8) {
            splitList.stream().limit(8).forEach(printNums::add);
            System.out.println("limit splitList = " + printNums.toString());
        } else {
            printNums.addAll(splitList);
            System.out.println("add All List :" + printNums.toString());
        }*/

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Collection.forEach 출력 시작");
        nums2.forEach(System.out::println);
        System.out.println("Stream.forEach 출력 시작");
        nums2.parallelStream().forEach(System.out::println);

    }
}
