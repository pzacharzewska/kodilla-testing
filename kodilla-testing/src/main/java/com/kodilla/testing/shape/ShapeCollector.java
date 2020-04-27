package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeCollector that = (ShapeCollector) o;

        return shapes.equals(that.shapes);
    }

    @Override
    public int hashCode() {
        return shapes.hashCode();
    }

    private ArrayList<ShapeCollector> shapes = new ArrayList<>();

    public void addFigure (Shape shape){
        ShapeCollector figure = new ShapeCollector();
        shapes.add(figure);
    }

    public boolean removeFigure (Shape shape){
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }

        return result;
    }

    public Shape getFigure(int n){
        ShapeCollector figure = null;
        if (n >= 0 && n < shapes.size()){
            figure = shapes.get(n);
        }

        return figure;

    }

    public void showFigures(){
        System.out.println(shapes);

    }

    public int getFiguresQuantity(){
        return shapes.size();
    }
}
