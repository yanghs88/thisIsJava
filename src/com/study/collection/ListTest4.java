package com.study.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.ToString;

public class ListTest4 {

    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
        int sum = intStream.peek(s -> System.out.println("s = " + s)).sum();
        System.out.println("sum = " + sum);

        List<Member> items = Arrays.asList(
            new Member("v1", 1),
            new Member("v2", 2),
            new Member("v3", 3)
        );

        List<Member> collect = items.stream()
//            .peek(s -> s.setName(s + "| bbbb"))
            .map(s -> {
                s.setName(s + "| bbbb");
                return s;
            })
            .collect(Collectors.toList());

        List<Member> collect2 = new ArrayList<>();
        items.forEach(s -> {
            s.setName(s + "| bbbb");
            collect2.add(s);
        });

        System.out.println("collect = " + collect.toString());


    }

    @ToString
    public static class Member {
        public String name;
        public Integer id;

        public Member(String name, Integer id) {
            this.name = name;
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
