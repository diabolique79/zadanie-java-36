package com.example.homework.model;


import com.example.homework.model.*;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    @Override
    public double circleArea(Circle circle) {

        return Math.round(Math.PI * Math.pow(circle.getR(), 2));

    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return Math.round(rectangle.getA() * rectangle.getB());

    }

    @Override
    public double ballVolume(Ball ball) {
        return Math.round(4 / 3 * Math.PI * Math.pow(ball.getR(), 2));


    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.round(Math.pow(cube.getA(),3));

    }
}
