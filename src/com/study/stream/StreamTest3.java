package com.study.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamTest3 {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        
        items.addAll(Arrays.asList("test1", "test2"));

        System.out.println("items.toString() = " + items.toString());
        
    }
}
