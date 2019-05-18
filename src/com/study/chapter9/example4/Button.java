package com.study.chapter9.example4;

public class Button {

    OnClickListner listner;

    void setOnClickListner(OnClickListner listner) {
        this.listner = listner;
    }

    void touch() {
        listner.onClick();
    }

    //중첩 인터페이스
    interface OnClickListner {
        void onClick();
    }
}
