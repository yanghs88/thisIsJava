package com.study.map;

import com.study.str.GlobalFilterEnum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmptyMap {

    public static void main(String[] args) {

        Map<String, Map<String, BrandGoodsCountDTO>> cachedBrandGoodsCountMap = new HashMap<>();

        Map<String, BrandGoodsCountDTO> subMap = new HashMap<>();
        subMap.put("ALL", BrandGoodsCountDTO.builder().count(1).build());
        subMap.put("MEN", BrandGoodsCountDTO.builder().count(2).build());
        subMap.put("WOMEN", null);
        cachedBrandGoodsCountMap.put("adidas", subMap);

        Map<String, BrandGoodsCountDTO> subMap2 = new HashMap<>();
//        subMap2.put("ALL", null);
//        subMap2.put("MEN", null);
//        subMap2.put("WOMEN", null);
        subMap2 = null;
        cachedBrandGoodsCountMap.put("nike", subMap2);


        Map<String, BrandGoodsCountDTO> brandGoodsCountGlobalFilterMap = cachedBrandGoodsCountMap.getOrDefault("adidas", Collections.emptyMap());
        System.out.println("brandGoodsCountGlobalFilterMap = " + brandGoodsCountGlobalFilterMap);


        List<String> brands = Arrays.asList("nike", "adidas");
        Map<String, List<GlobalFilterBrandIndexSummaryDTO>> testMap = brands.stream()
            .collect(Collectors
                .toMap(Function.identity(), brand -> GlobalFilterEnum.AVAILABLE_FILTERS.stream()
                    .map(globalFilter -> {
                        Map<String, BrandGoodsCountDTO> findMap = cachedBrandGoodsCountMap.getOrDefault(brand, Collections.emptyMap());

                        BrandGoodsCountDTO brandGoodsCountDTO = BrandGoodsCountDTO.builder().count(0).build();
                        if (Objects.nonNull(findMap)) {
                            BrandGoodsCountDTO findGoodsDTO = brandGoodsCountGlobalFilterMap.get(globalFilter.name());
                            if (Objects.nonNull(findGoodsDTO)) {
                                brandGoodsCountDTO = findGoodsDTO;
                            }
                        }

                        return convertBrandGoodsCount(globalFilter, brandGoodsCountDTO);
                    })
                    .collect(Collectors.toList())));

        System.out.println("testMap = " + testMap);

    }


    public static GlobalFilterBrandIndexSummaryDTO convertBrandGoodsCount(GlobalFilterEnum globalFilter, BrandGoodsCountDTO dto) {
        Integer goodsCount = 0;
        if (Objects.nonNull(dto) && Objects.nonNull(dto.getCount())) {
            goodsCount = dto.getCount();
        }

        return GlobalFilterBrandIndexSummaryDTO.builder()
            .globalFilter(globalFilter)
            .goodsCount(goodsCount)
            .build();
    }

}
