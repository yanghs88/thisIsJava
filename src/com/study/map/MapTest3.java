package com.study.map;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

public class MapTest3 {

    public static void main(String[] args) {

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("ALL", Arrays.asList(1,2,3,4,5));
        map.put("MEN", Arrays.asList(6,7,8,9,10));
        map.put("WOMEN", Arrays.asList(11,12,13,14,15));

        List<Integer> goods = new ArrayList<>();

        map.entrySet().stream()
            .map(Map.Entry::getValue)
            .forEach(goods::addAll);
//            .forEach(integers -> {
//                goods.addAll(integers);
//            });

        System.out.println("goods = " + goods);

        Map<String, List<GoodsPK>> collect = map.entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, item -> item.getValue().stream()
                .map(pk -> new GoodsPK(pk, 0))
                .collect(Collectors.toList())));

        System.out.println("find = " + StringUtils.join(collect));

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GoodsPK implements Serializable {
        private Integer goodsNo;
        private Integer goodsSub;
    }
}
