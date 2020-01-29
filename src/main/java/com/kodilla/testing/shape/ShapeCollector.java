package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapesList = new ArrayList<>();

    public List<Shape> getShapesList() {
        return shapesList;
    }

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapesList.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < shapesList.size() && n >= 0) {
            return shapesList.get(n);
        } else {
            return null;
        }
    }
}
