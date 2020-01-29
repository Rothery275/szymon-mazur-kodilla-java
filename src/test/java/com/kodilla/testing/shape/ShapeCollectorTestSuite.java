package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;


public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle(5.0);
        Shape square = new Square(10.4);
        Shape triangle = new Triangle(4.4, 12.5);
        ShapeCollector shapes = new ShapeCollector();
        //When
        shapes.addFigure(circle);
        shapes.addFigure(square);
        shapes.addFigure(triangle);
        int result = shapes.getShapesList().size();
        //Then
        Assert.assertEquals(3, result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape circle = new Circle(5.0);
        Shape square = new Square(10.4);
        Shape triangle = new Triangle(4.4, 12.5);
        ShapeCollector shapes = new ShapeCollector();
        //When
        shapes.addFigure(circle);
        shapes.addFigure(square);
        shapes.addFigure(triangle);
        shapes.removeFigure(circle);
        int result = shapes.getShapesList().size();
        //Then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape circle = new Circle(5.0);
        Shape square = new Square(10.4);
        ShapeCollector shapes = new ShapeCollector();
        //When
        shapes.addFigure(circle);
        shapes.addFigure(square);
        Shape result = shapes.getFigure(0);
        //Then
        Assert.assertEquals(circle, result);
    }

}
