package com.study.str;

import org.apache.commons.lang3.StringUtils;

public class Test4 {

    public static void main(String[] args) {

        String target = "";

        String[] split = StringUtils.split(target, "^");

        System.out.println("split0 = " + split[0]);
        System.out.println("split1 = " + split[1]);


    }
}
