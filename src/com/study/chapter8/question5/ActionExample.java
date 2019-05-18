package com.study.chapter8.question5;

public class ActionExample {

    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("복사를 시작합니다");
            }
        };

        action.work();
    }
}
