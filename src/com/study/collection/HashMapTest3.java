package com.study.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest3 {

    public static void main(String[] args) {

        Map<String, Long> test = new HashMap<>();
        test.put("adidas", 0L);
        test.put("nike", 1L);
        test.put("jeep", 2L);
        test.put("032c", 3L);

        System.out.println("adidas = " + test.get("adidas"));
        System.out.println("test = " + test.get("test"));


        Map<String, Long> test2 = new HashMap<>();
        test2.put("nike", 5L);
        test2.put("jeep", 6L);
        test2.put("032c", 7L);
        test2.put("adidas", 4L);


        System.out.println("test hashCode : " +  test.keySet().hashCode());
        System.out.println("test2 hashCode : " +  test2.keySet().hashCode());

    }
}
