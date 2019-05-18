package com.study.chapter9.example4;

public class CallListner implements Button.OnClickListner {
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다");
    }
}
