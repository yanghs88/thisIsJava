package com.study.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest1 {
    public static class Persion {
        int age;
        String name;

        public Persion(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }


    public static void main(String[] args) {

        String[][] sample = new String[][]{
            {"a", "b"}, {"c", "d"}, {"e", "a"}, {"a", "h"}, {"i", "j"}
        };

        Stream<String> stream = Arrays.stream(sample)
            .flatMap(array -> Arrays.stream(array))
            .filter(x-> "a".equals(x));

        stream.forEach(System.out::println);

    }
}
