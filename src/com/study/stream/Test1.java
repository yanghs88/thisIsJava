package com.study.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        Set<String> brands = new HashSet<>();
        brands.add("adidas");
        brands.add("covernat");
        brands.add("musinsa");
        brands.add("nike");
        brands.add("mark");

        Map<String, List<BrandContentsBannerEntity>> test = new HashMap<>();

        int i = 1;
        for (String brand : brands) {
            BrandContentsBannerEntity bannerEntity1 = new BrandContentsBannerEntity();
            bannerEntity1.setBrand(brand);
            bannerEntity1.setTitle("title1");

            BrandContentsBannerEntity bannerEntity2 = new BrandContentsBannerEntity();
            bannerEntity2.setBrand(brand);
            bannerEntity2.setTitle("title2");

            test.put(brand, Arrays.asList(bannerEntity1, bannerEntity2));

            System.out.println("order = " + i);
            System.out.println("test = " + test.toString());
            i++;
        }

        System.out.println("nike = " + test.get("nike"));


    }
}
