package com.study.stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExample {

    // 요소 처리
    public static void work(int value) {

    }

    public static long testParallel(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.stream().parallel().forEach(item -> work(item));
        long end = System.currentTimeMillis();
        return end-start;
    }

    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i=0; i<10000; i++) {
            arraylist.add(i);
            linkedList.add(i);
        }

        // 워밍업
        long arrayListParallel = testParallel(arraylist);
        long linkedListParallel = testParallel(linkedList);

        // 병렬 스트림 처리 시간 구하기
        arrayListParallel = testParallel(arraylist);
        linkedListParallel = testParallel(linkedList);

        System.out.println("array=" + arrayListParallel + ", linked=" + linkedListParallel);


        // 요소의 개수가 적을때는 linkedList 가 더빠른 속도를 보인다.

        if (arrayListParallel < linkedListParallel) {
            System.out.println("성능 테스트 결과 ArrayList 가 더 빠름");
        } else {
            System.out.println("성능 테스트 결과 LinkedList 가 더 빠름");
        }
    }
}
