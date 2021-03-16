package com.study.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ListToMap {

    public static void main(String[] args) {

        List<Map<String, Integer>> list = new ArrayList<>();
        Map<String, Integer> item1 = new LinkedHashMap<>();
        item1.put("001", 106755);
        list.add(item1);

        Map<String, Integer> item2 = new LinkedHashMap<>();
        item2.put("001001", 49868);
        list.add(item2);

        Map<String, Integer> item3 = new LinkedHashMap<>();
        item3.put("011", 31293);
        list.add(item3);

        Map<String, Integer> item4 = new LinkedHashMap<>();
        item4.put("003", 29414);
        list.add(item4);

        Map<String, Integer> item5 = new LinkedHashMap<>();
        item5.put("002", 23966);
        item5.put("111", 1111);
        list.add(item5);

//        Map<String, Integer> item6 = new LinkedHashMap<>();
//        item6.put("002", 1111);
//        list.add(item6);

        list.add(null);


        System.out.println("item.toString() = " + list.toString());

//        list.stream()
//            .forEach(stringIntegerMap -> System.out
//                .println("stringIntegerMap.toString() = " + stringIntegerMap.toString()));

        Map<String, Integer> duplicatedHashMap = new LinkedHashMap<>();

//        for (Map<String, Integer> stringIntegerMap : list) {
//            for (String key : stringIntegerMap.keySet()) {
//                System.out.println("key = " + key);
//                System.out.println("value = " + stringIntegerMap.get(key));
//                duplicatedHashMap.put(key, stringIntegerMap.get(key));
//            }
//        }
//        System.out.println("duplicatedHashMap.toString() = " + duplicatedHashMap.toString());

        list.stream()
            .filter(Objects::nonNull)
            .forEach(duplicatedHashMap::putAll);
//            .forEach(stringIntegerMap -> {
//                duplicatedHashMap.putAll(stringIntegerMap);
//            });

        System.out.println("duplicatedHashMap = " + duplicatedHashMap);
        System.out.println("duplicatedHashMap 001 = " + duplicatedHashMap.get("001"));

    }
}
