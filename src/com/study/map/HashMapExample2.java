package com.study.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapExample2 {

    public static void main(String[] args) {
        Map<String, Long> findColumn = new LinkedHashMap<>();
        findColumn.put("ageBand0", 1L);
        findColumn.put("ageBand19", 2L);
        findColumn.put("ageBand24", 2L);
        findColumn.put("ageBand29", 3L);
        findColumn.put("ageBand34", 3L);
        findColumn.put("ageBand40", 4L);


        System.out.println("findColumn.toString() = " + findColumn.toString());
        
        
        findColumn.entrySet()
            .stream()
            .filter(entry -> entry.getValue() == Collections.max(findColumn.values()))
            .forEach(stringLongEntry -> System.out.println("stringLongEntry.toString() = " + stringLongEntry.toString()));
        
        Optional<String> first = findColumn.entrySet()
            .stream()
            .filter(entry -> entry.getValue() == Collections.max(findColumn.values()))
            .map(Map.Entry::getKey)
            .findFirst();

        first.ifPresent(s -> System.out.println("find column = " + s));


        HashMap<Integer,Integer>map = new HashMap<Integer, Integer>();
        map.put(5, 60);
        map.put(1, 50);
        map.put(2, 60);
        map.put(3, 30);
        map.put(4, 60);

        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }

        Optional<Integer> any = map.entrySet()
            .stream()
            .filter(entry -> entry.getValue() == Collections.max(map.values()))
            .map(Map.Entry::getKey)
            .findAny();

        any.ifPresent(key -> System.out.println("key = " + key));

    }
}
