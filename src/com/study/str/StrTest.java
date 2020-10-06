package com.study.str;

import org.apache.commons.lang3.StringUtils;

public class StrTest {

    public static void main(String[] args) {

        String test = ".com";

        boolean result = StringUtils.isNotEmpty(test);

        System.out.println("result = " + result);

        //System.out.println("test.length() = " + test.length());
    }
}
