package com.study.chapter12;

public class PriorityExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            Thread thread = new CalcThread("thread" + i);

            //듀얼코어라...
            if (i == 10) {
                thread.setPriority(Thread.MAX_PRIORITY);
            } else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }

            thread.start();
        }

    }
}
