package com.study.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, List<Integer>> allCommentsMap = new HashMap<>();

        allCommentsMap.put("1", Arrays.asList(1,2,3,4));
        allCommentsMap.put("2", Arrays.asList(5,6));
        allCommentsMap.forEach((s, integers) -> System.out.println("s =" + s + " integers : " + integers.toString()));
        List<Integer> integers = allCommentsMap.get("3");
        System.out.println("integers = " + integers);


        Map<Long, String> test = Collections.emptyMap();
        System.out.println("test = " + test);
        String s = test.get(1L);


    }
}
