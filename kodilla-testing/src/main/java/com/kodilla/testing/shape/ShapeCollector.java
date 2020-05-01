package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector{

    private ArrayList<Shape> shapes = new ArrayList<>();


    public void addFigure (Shape shape){
        shapes.add(shape);
    }

    public void removeFigure (Shape shape){
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n > shapes.size() - 1 || n < 0) {
            return null;
        } else {
            return shapes.get(n);
        }
    }

    public void showFigures(){
        System.out.println(shapes);

    }

    public int getFiguresQuantity(){
        return shapes.size();
    }


}
