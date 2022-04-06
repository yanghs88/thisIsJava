package com.study.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest2 {

    public static void main(String[] args) {
        Map<String, List<Integer>> test = new HashMap<>();
        Map<String, List<Integer>> test2 = new HashMap<>();


        test.put("adidas", Arrays.asList(1));
        test.put("nike", Arrays.asList(1,2,3));


        test.forEach((brand, items) -> {
            System.out.println("brand = " + brand);
            System.out.println("items = " + items.toString());

            List<Integer> copy = items;
//            copy.add(100);

            test2.put(brand, copy);

        });

        System.out.println("test2 = " + test2.toString());

//        List<Integer> array = Arrays.asList(1,5,7,9);
//        array.add(1)


        List<String> brands = Arrays.asList("adidas", "nike");
        System.out.println("brands = " + brands.toString());


        List<String> brands2 = new ArrayList<>(2);
        brands2.add("test");
        brands2.add("test3");
        brands2.add("test4");
        brands2.add("test5");
        brands2.add("test6");
        System.out.println("brands2 = " + brands2.toString());

    }
}
