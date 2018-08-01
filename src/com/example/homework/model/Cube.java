package com.example.homework.model;

public class Cube extends Shape3D {

private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return super.toString() + CUBE + VOLUME;
    }
}
