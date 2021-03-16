package com.study.chapter12.coperation;

public class WorkObject {

    public synchronized void methodA() {
        System.out.println("ThreadA methodA() 작업 실행 ");

        notify(); // 일시정지 상태에 있는 ThreadB 를 실행 대기 상태로 만듬

        try {
            wait(); //ThreadA 를 일시정지 상태로 만듬
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB() {
        System.out.println("ThreadA methodB() 작업 실행 ");

        notify(); // 일시정지 상태에 있는 ThreadA 를 실행 대기 상태로 만듬

        try {
            wait(); //ThreadB 를 일시정지 상태로 만듬
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
