package com.study.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HashMapTest {

    private static Comparator<Map.Entry<String, Float>> entryComparator;

    public static void main(String[] args) {
//        Map<String, List<Float>> brandScoreMap = new HashMap<>();
//
//        SortedMap<String, Float> testMap = new TreeMap<>(Comparator.reverseOrder());
//
//        brandScoreMap.put("jeep", Arrays.asList(0.1f));
//
//        brandScoreMap.put("nike4", Arrays.asList(0.61f, 0.189f, 0.1809f, 0.1774f, 0.1647f));
//        brandScoreMap.put("nike1", Arrays.asList(0.31f, 0.189f, 0.1809f, 0.1774f, 0.1647f));
//        brandScoreMap.put("nike5", Arrays.asList(0.71f, 0.189f, 0.1809f, 0.1774f, 0.1647f));
//        brandScoreMap.put("nike2", Arrays.asList(0.41f, 0.189f, 0.1809f, 0.1774f, 0.1647f));
//        brandScoreMap.put("nike3", Arrays.asList(0.51f, 0.189f, 0.1809f, 0.1774f, 0.1647f));
//        brandScoreMap.put("adidas", Arrays.asList(0.21f, 1f, 0.809f, 0.774f, 0.647f));
//
//        System.out.println("brandScoreMap = " + brandScoreMap.toString());
//
//
//        brandScoreMap.forEach((brand, scoreList) -> {
//            Float maxScore = scoreList.stream().max(Float::compareTo).get();
//            System.out.println("brand : " + brand + ", maxScore :  " + maxScore);
//            testMap.put(brand, maxScore);
//        });
//
//        System.out.println("testMap = " + testMap.toString());

        Map<String, Float> map = new LinkedHashMap<>();
        map.put("Nepal", 2f);
        map.put("United States", 0.21f);
        map.put("India", 0.43f);
        map.put("England", 0.13f);
        map.put("Australia", 0.93f);

        Map<String, Float> result = sortMapByValue(map);
        for (Map.Entry<String, Float> entry : result.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", "
                + "Value: " + entry.getValue());
        }

    }

    public static LinkedHashMap<String, Float> sortMapByValue(Map<String, Float> map) {
        List<Map.Entry<String, Float>> entries = new LinkedList<>(map.entrySet());
        entryComparator = (o1, o2) -> o2.getValue().compareTo(o1.getValue());
        Collections.sort(entries, entryComparator);

        LinkedHashMap<String, Float> result = new LinkedHashMap<>();
        for (Map.Entry<String, Float> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
