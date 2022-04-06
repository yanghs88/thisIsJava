package com.study.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest2 {

    public static void main(String[] args) {
        List<String> brands = new ArrayList<>();

        brands.add("adidas");
        brands.addAll(test());
        brands.add("nike");

        System.out.println("brands = " + brands.size());

        for (String brand : brands) {
            System.out.println("brand = " + brand);
        }

    }

    public static List<String> test() {
        return Collections.emptyList();
    }

}
