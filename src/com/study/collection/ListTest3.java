package com.study.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ListTest3 {

    public static void main(String[] args) {

        // 배열의 원소는 똑같더라도 순서가 다르면 같지 않다.
//        List<String> brands1 = Arrays.asList("adidas", "nike");
//        List<String> brands2 = Arrays.asList("nike", "adidas");
//
//        System.out.println("brands1 = " + brands1.hashCode());
//        System.out.println("brands2 = " + brands2.hashCode());
//
//        boolean equals = brands1.equals(brands2);
//        System.out.println("List equals = " + equals);
//
//        System.out.println("======================== ");
//
//        // Set collection
//        Set<String> brands3 = new HashSet<>(Arrays.asList("adidas", "nike"));
//        Set<String> brands4 = new HashSet<>(Arrays.asList("nike", "adidas"));
//
//        System.out.println("brands3 = " + brands3.hashCode());
//        System.out.println("brands4 = " + brands4.hashCode());
//
//        boolean equals2 = brands3.equals(brands4);
//        System.out.println("equals2 = " + equals2);
//
//        SortedSet<String> brands5 = new TreeSet<>(Arrays.asList("adidas", "nike"));
//        SortedSet<String> brands6 = new TreeSet<>(Arrays.asList("nike", "adidas"));
//
//
//        System.out.println("brands5 = " + brands5.hashCode());
//        System.out.println("brands6 = " + brands6.hashCode());

        Set<String> test = new LinkedHashSet<>(Arrays.asList("0100bychaosfromundermind","032c","090factory","1000v","100percent","108seoul","1159studio","134mm","13blues","13month","13percent","14studio","1507","1537","18hour","1993studio","1mmchan","1newbrandtest","1soft","210x297","235laboratory"));
        Set<String> test2 = new LinkedHashSet<>(Arrays.asList("032c","090factory","1000v","100percent","108seoul","1159studio","134mm","13blues","13month","13percent","14studio","1507","1537","18hour","1993studio","1mmchan","1newbrandtest","1soft","210x297","235laboratory","0100bychaosfromundermind"));


        System.out.println("test5 = " + test.toString());


        System.out.println("test.hashCode() = " + test.hashCode());
        System.out.println("test2.hashCode() = " + test2.hashCode());


        Set<String> test3 = new HashSet<>(Arrays.asList("032c","090factory","1000v","100percent","108seoul"));
        Set<String> test4 = new HashSet<>(Arrays.asList("108seoul","1000v","032c","090factory","100percent"));

        System.out.println("test3.hashCode() = " + test3.hashCode());
        System.out.println("test4.hashCode() = " + test4.hashCode());


        boolean equals = test.equals(test2);
        System.out.println("equals = " + equals);





    }
}
