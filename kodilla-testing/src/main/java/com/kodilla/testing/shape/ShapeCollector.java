package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<ShapeCollector> shapes = new ArrayList<>();

    public void addFigure (Shape shape){

    }

    public boolean removeFigure (Shape shape){

        return true;

    }

    public Shape getFigure(int n){

        return null;

    }

    public void showFigures(){

    }

    public int getFiguresQuantity(){
        return shapes.size();
    }
}
