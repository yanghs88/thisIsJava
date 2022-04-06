package com.study.collection;

import java.util.Arrays;
import java.util.List;

public class SubListTest {

    public static void main(String[] args) {

        final List<String> brands = Arrays
            .asList("musinsastandard", "covernat", "thisisneverthat", "markgonzales", "lee", "yale",
                "lafudgestore", "ebbetsfield", "sculptor", "takeasy", "coor", "travel",
                "poloralphlauren", "nike", "mmlg", "drawfit", "diamondlayla", "romanticcrown",
                "mahagrid", "outstanding");

        final List<String> strings = brands.subList(2, brands.size());

        System.out.println("strings = " + strings);

        brands.stream().forEach(System.out::println);


    }
}
