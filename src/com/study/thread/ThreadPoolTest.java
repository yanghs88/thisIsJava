package com.study.thread;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingDeque<Runnable> queue = new LinkedBlockingDeque<>(8);
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(1,3,3, TimeUnit.SECONDS, queue);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new Task());
        }
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        executorService.shutdown();
    }

    private static class Task implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e) {
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }
    }
}
