package com.study.chapter8;

public class Audio implements RemoteControl {

    private int volumn;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 를 끕니다");
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

        System.out.println("현재 Audio 볼륨은 : " + this.volumn);

    }

    /**
     * default method 재정의
     *
     * @param mute
     */
    @Override
    public void setMute(boolean mute) {
        this.mute = mute;

        if (this.mute) {
            System.out.println("Audio 무음 처리 합니다");
        } else {
            System.out.println("Audio 무음 처리 해제 합니다");
        }
    }
}
