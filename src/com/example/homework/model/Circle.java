package com.example.homework.model;


public class Circle extends GeometricShape {

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() + CIRCLE + AREA ;
    }
}
