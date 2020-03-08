package com.study.solid.SRP;


/*
    SRP (Single Responseability Principle) - 단일 책임 원칙
    - 클래스를 변경하는 이유는 단 하나어야 한다.
    - UserSettingServiceBefore 라는 클래스의 두개의 책임이 있다. 변경, 접근권한 체크
    - 책임을 두개로 나눔.
 */
public class UserSettingServiceAfter {

    public void changeEmail(User user) {
        System.out.println("ChangeEmail");
        if (SercurityService.checkAccess(user)) {
            // 이메일 변경
        }
    }
}

