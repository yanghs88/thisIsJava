package com.study.chapter6;

public class Service {

    @PrintAnnoation
    public void method1() {
        System.out.println("실행 내용1");
    }

    @PrintAnnoation("-")
    public void method2() {
        System.out.println("실행 내용2");
    }

    @PrintAnnoation(value = "#", number = 20)
    public void method3() {
        System.out.println("실행 내용3");
    }
}
