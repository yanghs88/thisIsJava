package com.study.solid.OCP;

public class Circle implements Shape {
    public double radius;

    @Override
    public double Area() {
        return radius * radius * Math.PI;
    }
}
