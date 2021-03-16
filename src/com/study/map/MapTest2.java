package com.study.map;

import java.util.ArrayList;
import java.util.List;

public class MapTest2 {

    public static void main(String[] args) {

        List<Long> contentIdList = new ArrayList<>();
        contentIdList.add(1L);
        contentIdList.add(2L);
        contentIdList.add(3L);
        contentIdList.add(4L);
        contentIdList.add(5L);
        contentIdList.add(6L);

        //-174092652
        List<String> contentIdList2 = new ArrayList<>();
        contentIdList2.add("9161035");
        contentIdList2.add(null);
        contentIdList2.add("9160759");
//        contentIdList2.add("9160704");
//        contentIdList2.add("9160645");
//        contentIdList2.add("9160457");
//        contentIdList2.add("9160430");
//        contentIdList2.add("9160356");
//        contentIdList2.add("9160348");
//        contentIdList2.add("9160341");
//        contentIdList2.add("9160318");
//        contentIdList2.add("9160151");
//        contentIdList2.add("9160067");
//        contentIdList2.add("9159965");
//        contentIdList2.add("9159938");
//        contentIdList2.add("9159769");
//        contentIdList2.add("9159443");
//        contentIdList2.add("9159428");
//        contentIdList2.add("9159341");
//        contentIdList2.add("9159231");

        System.out.println("contentIdList.toString() = " + contentIdList.toString());
        System.out.println("contentIdList.hashCode() = " + contentIdList.hashCode());

        //display_web::brand_reviews_comments:-375913216
        //display_web::brand_reviews_comments:-375913216
        System.out.println("contentIdList2.toString() = " + contentIdList2.toString());
        System.out.println("contentIdList2.hashCode() = " + contentIdList2.hashCode());

        String a = "Test1";

    }
}
