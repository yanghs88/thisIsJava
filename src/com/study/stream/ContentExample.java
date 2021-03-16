package com.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContentExample {

    public static void main(String[] args) {

        List<Content> contents = Arrays.asList(
                new Content(1, "title1", Arrays.asList(
                        new Content.Goods(1, 0),
                        new Content.Goods(2, 0)
                )),
                new Content(2, "title2", Arrays.asList(
                        new Content.Goods(101, 1),
                        new Content.Goods(102, 1)
                )),
                new Content(3, "title3", Arrays.asList(
                        new Content.Goods(1001, 100),
                        new Content.Goods(1002, 100)
                ))
        );

//        contents.stream()
//                .forEach(content -> System.out.println("content.toString() = " + content.toString()));

        Function<Content, List<Content.Goods>> getGoodsList = Content::getGoodsList;

//        Map<Integer, List<List<String>>> collect = contents.stream()
//                .collect(
//                        Collectors.groupingBy(
//                                Content::getNo,
//                                Collectors.mapping(content -> content.getGoodsList()
//                                        .stream()
//                                        .map(goods -> goods.getGoodsNo() + "_0")
//                                        .collect(Collectors.toList()), Collectors.toList())
//                        )
//                );

        List<String> collect = contents.stream()
            .flatMap(content -> content.getGoodsList().stream())
            .map(goods -> goods.getGoodsNo() + "_0")
            .collect(Collectors.toList());

        Map<Integer, List<String>> collect1 = contents.stream()
            .collect(
                Collectors.toMap(content -> content.getNo(), content -> content.getGoodsList().stream()
                    .map(goods -> goods.getGoodsNo() + "_0")
                    .collect(Collectors.toList())));

        System.out.println("collect.toString() = " + collect.toString());

    }
}
