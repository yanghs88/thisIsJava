package com.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest4 {

    public static void main(String[] args) {

        List<String> brands = Arrays.asList("0100bychaosfromundermind","032c","090factory","1000v","100percent","108seoul","1159studio","134mm","13blues","13month","13percent","14studio","1507","1537","18hour","1993studio","1mmchan","1newbrandtest","1soft","210x297");

        int total = 20;
        int offset = 4;
        int size = 2;

        List<String> collect = IntStream.range(offset, (offset + size))
            .mapToObj(index -> index % total)
            .map(brands::get)
            .collect(Collectors.toList());

        System.out.println("collect = " + collect.toString());



        IntStream.range(4, 6)
            //.mapToObj(index -> index % total)
            .forEach(value -> System.out.println("value = " + value));

    }

}
