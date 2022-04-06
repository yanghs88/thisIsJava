package com.study.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ForkJoinPoolTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        IntStream range = IntStream.range(0, 10);

        List<String> items = Arrays.asList("a","b","c","d","e","f","g","h","i","j");

        List<String> result = new ArrayList<>();

        ForkJoinPool forkjoinPool = new ForkJoinPool(4);
        forkjoinPool.submit(() -> {
            items.parallelStream().forEach(index -> {
                System.out
                    .println("Thread : " + Thread.currentThread().getName() + ", index " + index);
                try {
                    System.out.println("Thread Sleep =========================");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

                result.add(index);

            });
        }).get();

        System.out.println("result = " + result);

    }
}
