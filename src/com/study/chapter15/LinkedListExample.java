package com.study.chapter15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long startTime;
        long endTime;

        int loopCnt = 500000;

        startTime = System.currentTimeMillis();
        for (int i=0; i<loopCnt; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.currentTimeMillis();

        System.out.println("ArrayList 소요 시간은 : " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i=0; i<loopCnt; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.currentTimeMillis();

        System.out.println("LinkedList 소요 시간은 : " + (endTime - startTime) + "ms");
    }
}
