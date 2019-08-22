package com.study.chapter15.Question10;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("blue", 90));
        treeSet.add(new Student("red", 10));
        treeSet.add(new Student("black", 98));

        Student student = treeSet.last();
        System.out.println("최고 점수 : "+ student.score);
        System.out.println("최고 점수 받은 아이디 : "+ student.id);
    }
}
