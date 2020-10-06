package com.study.observer;

public class Main {

    public static void main(String[] args) {

        책끝을접다 페이지 = new 책끝을접다();
        Observer 구독자1 = new 라이언();
        Observer 구독자2 = new 무지();

        페이지.구독하기(구독자1);
        페이지.구독하기(구독자2);

        페이지.신규컨텐츠나왔다();

        페이지.구독해지(구독자2);
        페이지.신규컨텐츠나왔다();
    }
}
