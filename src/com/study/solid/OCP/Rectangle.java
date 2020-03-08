package com.study.solid.OCP;

public class Rectangle implements Shape {

    public double witdh;
    public double height;

    @Override
    public double Area() {
        return witdh * height;
    }
}


