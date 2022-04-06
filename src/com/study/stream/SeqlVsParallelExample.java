package com.study.stream;

import java.util.Arrays;
import java.util.List;

public class SeqlVsParallelExample {

    public static void work(int value) {
        try{
            // 값이 작을수록  순차 처리가 빠름
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }
    }

    public static long testSeq(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.stream().forEach(SeqlVsParallelExample::work);
        return System.currentTimeMillis() - start;
    }

    public static long testParallel(List<Integer> list) {
        long start = System.currentTimeMillis();
        list.parallelStream().forEach(SeqlVsParallelExample::work);
        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7);

        long seqTime = testSeq(list);
        long parallelTime = testParallel(list);

        System.out.println("seqTime="+seqTime+ "ms, parallelTime="+parallelTime+"ms");

        if (seqTime < parallelTime) {
            System.out.println("순차처리가 빠름");
        } else {
            System.out.println("병렬 스트림이 빠름");
        }
    }
}
