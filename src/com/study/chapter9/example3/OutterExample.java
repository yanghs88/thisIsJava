package com.study.chapter9.example3;

public class OutterExample {

    public static void main(String[] args) {
        Outter outter = new Outter();

        Outter.Nested nested = outter.new Nested();
        nested.print();
    }
}
