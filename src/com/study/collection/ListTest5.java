package com.study.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest5 {

    public static void main(String[] args) {
        final List<String> brands = Arrays
            .asList("musinsastandard", "covernat", "thisisneverthat");

        final List<String> filterBrands = brands.stream().limit(10)
            .collect(Collectors.toList());

        System.out.println("filterBrands = " + filterBrands);


    }
}
