package com.study.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap9 {

    public static void main(String[] args) {

        Map<String, Integer> items = new HashMap<>();
        items.put("adidas", 100);

        final Integer findItem = items.getOrDefault("adidas2", 200);

        System.out.println("findItem = " + findItem);

    }
}
