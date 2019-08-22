package com.study.chapter17;

public class Student implements Comparable<Student> {

    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int score;
    private int sex;

    public Student(String name, int score, int sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public int getSex() {
        return sex;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }
}
