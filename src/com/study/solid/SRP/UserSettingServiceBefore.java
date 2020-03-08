package com.study.solid.SRP;

public class UserSettingServiceBefore {

    public void changeEmail(User user) {
        System.out.println("ChangeEmail");
        if (checkAccess(user)) {
            // 이메일 변경
        }
    }

    public boolean checkAccess(User user) {
        System.out.println("CheckAccess ");
        return true;
    }
}
