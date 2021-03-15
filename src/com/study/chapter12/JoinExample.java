package com.study.chapter12;

public class JoinExample {

    public static void main(String[] args) {

        SumThread thread = new SumThread();
        thread.start();


        try {
            // 다른 스레드가 종료 할떄 까지 메인스레드 일시 정지
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread.getSum() = " + thread.getSum());
    }
}
