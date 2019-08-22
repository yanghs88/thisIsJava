package com.study.chapter17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

    public static void main(String[] args) {

        IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
        intStream.sorted()
                .forEach(n -> System.out.print(n+ ","));
        System.out.println();

        List<Student> studentList = Arrays.asList(
            new Student("victor1", 30, Student.FEMALE),
            new Student("victor1", 60, Student.FEMALE),
            new Student("victor1", 70, Student.FEMALE) ,
            new Student("victor1", 100, Student.FEMALE)
        );

        //오름 차순
        studentList.stream()
                    .sorted()
                    .forEach(s -> System.out.print(s.getName() + ":" + s.getScore() + " "));

        System.out.println();
        //내림차순
        studentList.stream()
                    .sorted(Comparator.reverseOrder())
                    .forEach(s -> System.out.print(s.getName() + ":" + s.getScore() + " "));
        System.out.println();
    }
}
