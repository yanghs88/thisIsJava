package com.study.chapter8;

public interface RemoteControl {

    //상수
    int MAX_VOLUMN = 10;
    int MIN_VOLUMN = 0;


    //추상 메소드
    void turnOn();

    void turnOff();

    void setVolumn(int volumn);


    //default 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리 합니다");
        } else {
            System.out.println("무음 해제 합니다.");
        }
    }

    //정적 메소드
    static void chagneBattery() {
        System.out.println("건전지를 교체 합니다");
    }

}
