package com.study.str;

public class CategoryTest {

    public static void main(String[] args) {

        String a = "001001010";

        String b = "002";


        Integer findInteger = Integer.valueOf(a);
        System.out.println("findInteger = " + findInteger);

        Integer integer2 = Integer.valueOf(b);
        System.out.println("integer2 = " + integer2);

        Integer plusInteger = integer2 + 1;

        System.out.println("plusInteger = " + plusInteger);



    }
}
