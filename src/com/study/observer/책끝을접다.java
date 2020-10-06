package com.study.observer;

import java.util.ArrayList;
import java.util.List;

public class 책끝을접다 implements Observable {

    List<Observer> observerList = new ArrayList<>();

    private boolean 신규컨텐츠등록;

    public boolean is신규컨텐츠등록() {
        return 신규컨텐츠등록;
    }

    public void 신규컨텐츠나왔다() {
        System.out.println("신규 컨텐츠가 등록되었습니다.");
        신규컨텐츠등록 = true;

        구독자들에게알리기();
    }


    @Override
    public void 구독하기(Observer o) {
        observerList.add(o);
    }

    @Override
    public void 구독해지(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void 구독자들에게알리기() {
        observerList.forEach(Observer::업데이트);
    }
}
