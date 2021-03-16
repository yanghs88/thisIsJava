package com.study.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        //배열 스트림
//        String[] arr = new String[] {"A","B","C"};
//        Stream<String> stream = Arrays.stream(arr);

        //컬레션 스트림
//        List<String> list = Arrays.asList("A", "B", "C");
//        Stream<String> stream = list.stream();
//        Stream<String> paralleStream = list.parallelStream();


//        Stream<String> generatedStream = Stream.generate(() -> "gen").limit(10);
//        generatedStream.forEach(s -> System.out.println("s = " + s));

        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("test1", "aaa");
        testMap.put("test2", "bbb");
        String test3 = testMap.get("test3");
        System.out.println("test3 = " + test3);

    }
}
