package com.study.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest7 {

    public static void main(String[] args) {
        Map<String, Float> saleRateMap = new HashMap<>();

        List<String> brands = Arrays.asList("adidas", "musinsastandard", "jeep", "032c");

        saleRateMap.put("adidas", 0.9f);
        saleRateMap.put("nike", 0.7f);
        saleRateMap.put("jeep", 0.54f);
        saleRateMap.put("coor", 0.23f);

        final List<String> collect = brands.stream()
            .filter(saleRateMap::containsKey)
            .collect(Collectors.toList());

        System.out.println("collect = " + collect);

        final List<Float> collect1 = brands.stream()
            .filter(saleRateMap::containsKey)
            .map(saleRateMap::get)
            .collect(Collectors.toList());

        System.out.println("collect1 = " + collect1);

        final Map<String, Float> collect2 = saleRateMap.entrySet().stream()
            .filter(item -> brands.contains(item.getKey()))
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("collect2 = " + collect2);

    }
}
