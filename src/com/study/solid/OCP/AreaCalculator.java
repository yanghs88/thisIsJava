package com.study.solid.OCP;


/**
 * OCP ( Open-Closed Principle) - 개방 폐쇄 원칙
 * 기능을 변경하거나 확장할 수 있으면서 그 기능을 사용하는 코드는 수정하지 않는다.
 */
public class AreaCalculator {

    public static double Area(Shape[] shapes) {

        double area = 0 ;

        for (Shape shape : shapes) {
            area += shape.Area();
        }

        return area;
    }

    public static void main(String[] args) {


        Circle circle = new Circle();
        circle.radius = 3;

        Rectangle rectangle = new Rectangle();
        rectangle.witdh = 2;
        rectangle.height = 5;


        Shape[] shapes = new Shape[2];
        shapes[1] = circle;
        shapes[0] = rectangle;


        double area = Area(shapes);

        System.out.println("area = " + area);


    }
}
