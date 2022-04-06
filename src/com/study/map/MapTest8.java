package com.study.map;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest8 {

    public static void main(String[] args) {

        Map<String, Map<String, Float>> brandCategoryMap = new HashMap<>();

        final Map<String, Float> categoryMap = Stream.of(
            new AbstractMap.SimpleEntry<>("002024", 0.1f),
            new AbstractMap.SimpleEntry<>("002002", 0.2f),
            new AbstractMap.SimpleEntry<>("002003", 0.3f),
            new AbstractMap.SimpleEntry<>("002015", 0.4f),
            new AbstractMap.SimpleEntry<>("002004", 0.5f),
            new AbstractMap.SimpleEntry<>("002001", 0.6f)
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        brandCategoryMap.put("adidas", categoryMap);

        final Map<String, Float> categoryMap2 = Stream.of(
            new AbstractMap.SimpleEntry<>("002024", 0.9f),
            new AbstractMap.SimpleEntry<>("003022", 0.9f),
            new AbstractMap.SimpleEntry<>("003001", 0.8f),
            new AbstractMap.SimpleEntry<>("003002", 0.7f),
            new AbstractMap.SimpleEntry<>("003017", 0.6f),
            new AbstractMap.SimpleEntry<>("003003", 0.5f),
            new AbstractMap.SimpleEntry<>("003020", 0.4f),
            new AbstractMap.SimpleEntry<>("003023", 0.3f),
            new AbstractMap.SimpleEntry<>("003024", 0.2f),
            new AbstractMap.SimpleEntry<>("003012", 0.91f),
            new AbstractMap.SimpleEntry<>("003014", 0.92f),
            new AbstractMap.SimpleEntry<>("003006", 0.93f)
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        brandCategoryMap.put("jeep", categoryMap2);

        List<String> findCategory = Arrays.asList("003006", "002004");

        final List<String> categoryList = brandCategoryMap.entrySet().stream()
            .flatMap(item -> item.getValue().entrySet().stream())
            .filter(findCategory::contains)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        // {"001" : ["adidas", "nike"]}
        Map<String, Set<String>> categoryBrandSetMap = brandCategoryMap.entrySet().stream()
            .map(entry -> {
                String brand = entry.getKey();
                Set<String> categories = entry.getValue().keySet();

                return categories.stream()
                    .map(category -> new AbstractMap.SimpleEntry<>(category, brand))
                    .collect(Collectors.toList());
            })
            .flatMap(Collection::stream)
            .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toSet())));

        final Set<String> finalBrands = categoryBrandSetMap.entrySet().stream()
            .filter(entry -> findCategory.contains(entry.getKey()))
            .flatMap(entry -> entry.getValue().stream())
            .collect(Collectors.toSet());

//        System.out.println("finalBrands = " + finalBrands);

        Map<String, Set<String>> categoryBrandListMap = new HashMap<>();
        brandCategoryMap.forEach((brand, categoryRateMap) -> {
            categoryRateMap.keySet().forEach(category -> {
                final Set<String> brands = categoryBrandListMap.getOrDefault(category, new HashSet<>());
                brands.add(brand);
                categoryBrandListMap.put(category, brands);
            });
        });
        System.out.println("categoryBrandListMap = " + categoryBrandListMap);

        final Set<String> finalBrands2 = categoryBrandListMap.entrySet().stream()
            .filter(entry -> findCategory.contains(entry.getKey()))
            .flatMap(entry -> entry.getValue().stream())
            .collect(Collectors.toSet());

        System.out.println("finalBrands2 = " + finalBrands2);


    }
}
