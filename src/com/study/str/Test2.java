package com.study.str;

public class Test2 {

    public static void main(String[] args) {

        String tags = "LIKE 백";
        String tags2 = "CnS & _+^ 테스트 aaaa bbb ccc ddd rr aBcD";

        String removeTags = tags.replaceAll(" ", "");

        System.out.println("removeTags = " + removeTags);

        String upperCase = tags2.toUpperCase();

        System.out.println("upperCase = " + upperCase);




    }
}
