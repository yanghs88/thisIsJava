package com.study.chapter12;

public class ThreadB extends Thread {

    public boolean stop = false;
    public boolean work = true;

    public ThreadB() {
        setName("ThreadB");
    }

    @Override
    public void run() {

//        for (int i=0; i<2; i++) {
//            System.out.println(getName()  + " 가 출력한 내용 ");
//        }

        while (!stop)
        {
            if (work) {
                System.out.println("ThreadB 작업 내용");
            }
            else {
                Thread.yield();
            }
        }

        System.out.println("ThreadB 종료");


    }
}
