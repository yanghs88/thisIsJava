package com.study.chapter8;

public class RemoteControlExample {

    public static void main(String[] args) {

        // 인터페이스를 사용하는것이 아님.
        //Television tv = new Television();

        RemoteControl rc;
        rc = new Television();
        rc.turnOn();
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setMute(true);


        RemoteControl.chagneBattery();
    }
}
