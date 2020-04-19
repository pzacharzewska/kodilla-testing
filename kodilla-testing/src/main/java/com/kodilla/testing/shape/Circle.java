package com.kodilla.testing.shape;

public class Circle implements Shape {

    String name = "circle";
    double r;
    double PI = 3.14;

    public Circle(String name, double r) {
        this.name = name;
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getShapeField() {
        return PI*r*r ;
    }

}
