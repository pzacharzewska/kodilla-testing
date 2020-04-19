package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String name = "triangle";
    double height;
    double base;

    public Triangle(String name, double height, double base) {
        this.name = name;
        this.height = height;
        this.base = base;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getShapeField() {
        return 0.5*height*base;
    }
}
