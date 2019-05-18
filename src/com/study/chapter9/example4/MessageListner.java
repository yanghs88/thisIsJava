package com.study.chapter9.example4;

public class MessageListner implements Button.OnClickListner {
    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}
