package com.study.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ParallelTest {

    public static void main(String[] args) {

        List<String> items = Arrays.asList("A", "B", "C");
        List<String> result = new LinkedList<>();

        items.parallelStream()
            .forEach(item -> {
                try {
                    result.add(test(item));
                } catch (InterruptedException e) {
                    System.out.println("Error = " + e);
                    e.printStackTrace();
                }
            });

        System.out.println("result = " + result);

    }

    public static String test(String target) throws InterruptedException {

        switch (target) {
            case "A" : return testA();
            case "B" : return testB();
            case "C" : return testC();
            default: return "Empty";
        }
    }


    public static String testA() {
//        System.out.println("Current thread : " + Thread.currentThread().getName());
        return "AA";
    }

    public static String testB() {
//        System.out.println("Current thread : " + Thread.currentThread().getName());
        return "BB";
    }

    public static String testC() throws InterruptedException {
        Thread.sleep(3000);
//        System.out.println("Current thread : " + Thread.currentThread().getName());
        return "cc";

    }


}
