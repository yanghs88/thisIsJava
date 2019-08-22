package com.study.chapter12;

public class PriorityExample {

    public static void main(String[] args) {

        for (int i=1; i<=100; i++) {
            Thread thread = new CalcThread("thread" + i);

            if(i == 100) {
                thread.setPriority(Thread.MAX_PRIORITY);
            }else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }

            thread.start();
        }

    }
}
