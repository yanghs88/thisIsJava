package com.study.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapTest5 {

    public static void main(String[] args) {
        List<String> AVAILABLE_FILTERS = Arrays.asList("ALL", "MEN", "WOMEN");

        Map<String, Map<String, List<Integer>>> test = new HashMap<>();
        Map<String, List<Integer>> subMap1 = new HashMap<>();

        AVAILABLE_FILTERS.forEach(globalFilter -> {
            List<Integer> integers;
            if (globalFilter == "ALL") {
                integers = Arrays.asList(1,2,3,4,5);
            } else if (globalFilter == "MEN") {
                integers = Arrays.asList(6,7,8,9,10);
            } else {
                integers = Arrays.asList(11,12,13,14,15);
            }
            subMap1.put(globalFilter, integers);
        });

        test.put("adidas", subMap1);


        Map<String, List<Integer>> subMap2 = new HashMap<>();
        AVAILABLE_FILTERS.forEach(globalFilter -> {
            List<Integer> integers;
            if (globalFilter == "ALL") {
                integers = Arrays.asList(11,12,13,14,15);
            } else if (globalFilter == "MEN") {
                integers = Arrays.asList(16,17,18,19,110);
            } else {
                integers = Arrays.asList(21,22,23,24,25);
            }
            subMap2.put(globalFilter, integers);
        });

        test.put("nike", subMap2);
        
        Set<Integer> allItems = new HashSet<>();
        
        test.values().forEach(s -> {
//            System.out.println("s.values() = " + s.values());
        });

        test.values().forEach(s -> {

            System.out.println("s.to = " + s.toString());

            Collection<List<Integer>> values = s.values();

            s.values().forEach(allItems::addAll);
        });

        System.out.println("allItems = " + allItems.toString());
        
    }
}
