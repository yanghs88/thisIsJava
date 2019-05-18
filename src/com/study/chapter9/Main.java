package com.study.chapter9;

public class Main {

    public static void main(String[] args) {

        A a = new A();

        //인스턴스 맴버 클래스 객체 생성
        A.B b = a.new B();
        b.field1 = 3;
        b.method1();

        //정적맴버 클래스 객체 생성
        A.C c = new A.C();
        c.field1 = 5;
        c.method1();

        A.C.field2 = 5;
        A.C.method2();

        a.method();;
    }
}
