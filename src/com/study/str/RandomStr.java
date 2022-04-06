package com.study.str;

import java.util.UUID;

public class RandomStr {

    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString().replace("-", "");
        System.out.println("uuid = " + uuid);
        System.out.println("uuid.length() = " + uuid.length());
    }

}
