package com.kodilla.testing.shape;

public class Square implements Shape {

    String name = "square";
    double side;

    public Square(String name, double side) {
        this.name = name;
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getShapeField() {
        return side*2;
    }
}
