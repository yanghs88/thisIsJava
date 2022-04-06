package com.study.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class MapTest6 {

    public static void main(String[] args) {

        List<Map<String, List<Integer>>> cachedList = new ArrayList<>();

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("adidas", Arrays.asList(1,2,3,4,5));
        map.put("nike", Arrays.asList(6,7,8,9,10));
        map.put("musinsastandard", null);

        cachedList.add(map);

//        cachedList.forEach(item -> {
//            System.out.println("item.toString() = " + item.toString());
//        });



        map.forEach((key, value) -> {
            System.out.println("findMap.getKey() = " + key);
            System.out.println("findMap.getValue() = " + value);
        });

//        int i = (5500/1000) + 1;

        for (int i=1; i<=6; i++) {
            int result = calculateOffset(1000, i);
            System.out.println("call Count = " + i);
            System.out.println("result = " + result);
        }


        Map<String, Test> test = new HashMap<>();

        test.put("aaa", new Test("adidas", 1));
        test.put("bbb", new Test("nike", 2));

        test.forEach((key, value) -> {
            System.out.println("key = " + key);
            System.out.println("value = " + value);
        });



    }

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    public static class Test {
        private String brand;
        private Integer rank;
    }
    private static int calculateOffset(int partitionSize, int callCount) {
        if (callCount == 1 ) {
            return 0;
        }
        return (partitionSize * (callCount-1));
    }
}
