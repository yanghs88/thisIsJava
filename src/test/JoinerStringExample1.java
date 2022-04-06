package test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoinerStringExample1 {

    public static void main(String[] args) {

        String delimiter = "*";

        String first = "관우";
        String second = "장비";
        String third = "조운";
        String fourth = "황충";
        String five = "마초";
        System.out.println(first + delimiter + second + delimiter + third + delimiter + fourth + delimiter + five);


        String[] items = new String[] {"A", "B", "C", "D", "E", "F"};

        final String joinString = String.join(delimiter, items);
        System.out.println("joinString = " + joinString);

        StringJoiner stringJoiner = new StringJoiner(delimiter);

        stringJoiner.add(first);
        stringJoiner.add(second);
        stringJoiner.add(third);
        stringJoiner.add(fourth);
        stringJoiner.add(five);

        System.out.println(stringJoiner.toString());


        List<String> items2 = Arrays.asList("1","2","3");

        String result = items2.stream().collect(Collectors.joining(delimiter));

        System.out.println(result);



    }
}
