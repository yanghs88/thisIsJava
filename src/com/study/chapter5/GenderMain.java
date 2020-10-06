package com.study.chapter5;

public class GenderMain {

    public static void main(String[] args) {

        int target = 4;
        String codeByValue = GenderEnum.getCodeByValue(target);

        //System.out.println("codeByValue = " + codeByValue);

        String codeConcat = GenderEnum.getCodeConcat(30);
        System.out.println("codeConcat = " + codeConcat);
    }
}
