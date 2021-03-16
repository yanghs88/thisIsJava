package com.study.str;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {


        List<String> reviewSex = new ArrayList<>();
        reviewSex.add("test");
        reviewSex.clear();

        reviewSex = null;



        System.out.println("reviewSex = " + reviewSex.isEmpty());

    }
}
