package com.example.homework.app;

import com.example.homework.model.*;

import java.util.SortedMap;

public class Test {

    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Line2D line2D = new Line2D(2.1, 2.2, 1.5, -1.8);
        LineCalc lineCalc = new LineCalc();
        System.out.println(line2D.toString() + lineCalc.lineLength(line2D));

        Circle circle = new Circle(2.5);
        System.out.println(circle.toString() + shapeCalculator.circleArea(circle));

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.toString() + shapeCalculator.rectangleArea(rectangle));

        Ball ball = new Ball(6);
        System.out.println(ball.toString() + shapeCalculator.ballVolume(ball));

        Cube cube = new Cube(5);
        System.out.println(cube.toString() + shapeCalculator.cubeVolume(cube));


    }
}
