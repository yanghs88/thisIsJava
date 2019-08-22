package com.study.chapter15.Question8;

public class Student {
    public int studentNum;
    public String name;

    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.studentNum;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Student) {
            Student student = (Student) obj;
            return student.studentNum == this.studentNum;
        } else {
            return false;
        }
    }
}
