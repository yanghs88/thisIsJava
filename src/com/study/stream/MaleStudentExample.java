package com.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaleStudentExample {

    public static void main(String[] args) {

        List<Student> totalList = Arrays.asList(
                new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
                new Student("배수지", 6, Student.Sex.FEMALE, Student.City.Pusan),
                new Student("양희서", 5, Student.Sex.MALE, Student.City.Seoul),
                new Student("한효주", 5, Student.Sex.FEMALE, Student.City.Pusan)
        );

        MaleStudent maleStudent = totalList.stream()
                .filter(student -> student.getSex().equals(Student.Sex.MALE))
                .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);


        Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(Student::getSex));

        mapBySex.get(Student.Sex.MALE)
                .stream().forEach(s -> System.out.println("s.getName() = " + s.getName()));


        Map<Student.City, List<String>> mapByCity = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student::getCity,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        )
                );

        mapByCity.get(Student.City.Seoul)
                .stream().forEach(s -> System.out.println("s = " + s));

        mapByCity.get(Student.City.Pusan)
                .stream().forEach(s -> System.out.println("s = " + s));


    }
}
