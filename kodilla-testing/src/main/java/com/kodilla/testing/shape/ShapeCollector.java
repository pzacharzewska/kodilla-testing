package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector{

    private ArrayList<ShapeCollector> shapes = new ArrayList<>();

    public void addFigure (Shape shape){
        ShapeCollector figure = new ShapeCollector();
        shapes.add(figure);
    }

    public void removeFigure (Shape shape){
        shapes.remove(shape);
    }

    public Shape getFigure(int n){
      return null;
    }

    public void showFigures(){
        System.out.println(shapes);

    }

    public int getFiguresQuantity(){
        return shapes.size();
    }
}
