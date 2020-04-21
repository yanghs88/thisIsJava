package com.study.chapter8;

public class Television implements RemoteControl {

    private int volumn;

    @Override
    public void turnOn() {
        System.out.println("TV 를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 를 끕니다");
    }

    @Override
    public void setVolumn(int volumn) {

        if (volumn > RemoteControl.MAX_VOLUMN) {
            this.volumn = RemoteControl.MAX_VOLUMN;
        } else if (volumn < RemoteControl.MIN_VOLUMN) {
            this.volumn = RemoteControl.MIN_VOLUMN;
        } else {
            this.volumn = volumn;
        }

        System.out.println("현재 TV 볼륨은 : " + this.volumn);

    }
}
