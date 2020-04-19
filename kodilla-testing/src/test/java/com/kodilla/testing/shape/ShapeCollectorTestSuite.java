package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("Tests are finished.");
    }
    @Before
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Triangle("triangle", 4.0, 3.0));
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle("circle", 8));
        boolean result = shapeCollector.removeFigure(new Circle("circle", 8));
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape figure1 = new Square("square",5);
        shapeCollector.addFigure(figure1);
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);
        Assert.assertEquals(figure1, retrievedFigure);
    }
}
