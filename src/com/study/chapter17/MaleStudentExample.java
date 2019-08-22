package com.study.chapter17;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {

    public static void main(String[] args) {

        List<Student> totalList = Arrays.asList(
            new Student("victor1", 10, Student.MALE),
            new Student("victor2", 10, Student.FEMALE),
            new Student("victor3", 10, Student.MALE),
            new Student("victor4", 10, Student.MALE)
        );

        MaleStudent maleStudent = totalList.stream()
                                            .filter(s -> s.getSex() == Student.MALE)
                                            .collect(MaleStudent::new, MaleStudent::accmulate, MaleStudent::combine);

        maleStudent.getList().stream()
                            .forEach(s -> System.out.println(s.getName()));

    }
}
