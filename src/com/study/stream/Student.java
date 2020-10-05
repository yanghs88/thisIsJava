package com.study.stream;


public class Student {

    public enum Sex {FEMALE, MALE}

    public enum City {Seoul, Pusan}


    private String name;
    private int score;

    private Sex sex;
    private City city;

    public Student(String name, int score, Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Sex getSex() {
        return sex;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", sex=" + sex +
                ", city=" + city +
                '}';
    }
}
