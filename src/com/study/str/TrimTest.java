package com.study.str;

import java.util.ArrayList;
import java.util.List;

public class TrimTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("ttt,ooo");

        List<String> tags = new ArrayList<>();

        list.forEach(item -> {
            String[] split = item.split(",");
            for (String tag : split) {
                if (!tag.isEmpty()) {
                    tags.add(tag.trim());
                }

            }
        });

        System.out.println("tags = " + tags);

    }
}
