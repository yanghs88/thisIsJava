package com.study.chapter12;

public class ThreadA extends Thread {

    public boolean stop = false;
    public boolean work = true;

    public ThreadA() {
        setName("ThreadA");
    }

    @Override
    public void run() {

//        for (int i=0; i<2; i++) {
//            System.out.println(getName()  + " 가 출력한 내용 ");
//        }

        while (!stop)
        {
            if (work) {
                System.out.println("ThreadA 작업 내용");
            }
            else {
                // 다른 thread 실행 양보하다.
                Thread.yield();
            }
        }

        System.out.println("ThreadA 종료");

    }
}
