package com.study.chapter15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("java");
        list.add("JDBC");
        list.add("Servlet/Jsp");
        list.add(1, "Database");
        list.add("iBATIS");

        int size = list.size();
        System.out.println("총 객체수 :" + size);

        String skill = list.get(3);
        System.out.println("skil : " + skill);

        for (int i=0; i<size; i++) {

            String str = list.get(i);
            System.out.println(str);
        }

        list.remove("Database");

        System.out.println("============================================");
        for (int i=0; i<list.size(); i++) {

            String str = list.get(i);
            System.out.println(str);
        }

    }
}
