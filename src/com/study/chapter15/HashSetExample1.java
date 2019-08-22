package com.study.chapter15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("c++");
        set.add("c");
        set.add("c#");
        set.add("go");
        set.add("javascript");
        set.add("java");

        //set.remove("c++");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())
        {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
