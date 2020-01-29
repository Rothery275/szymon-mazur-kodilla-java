package com.kodilla.testing.shape;

public class Circle implements Shape {
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return PI * radius;
    }
}