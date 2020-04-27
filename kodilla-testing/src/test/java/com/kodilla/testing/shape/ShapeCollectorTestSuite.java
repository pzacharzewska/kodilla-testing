package com.kodilla.testing.shape;

import org.junit.*;

import static org.junit.Assert.*;

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
        assertEquals(1, shapeCollector.getFiguresQuantity());
        System.out.println(shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Triangle("triangle", 4.0, 3.0));
        boolean result = shapeCollector.removeFigure(new Triangle("triangle", 4.0, 3.0));
        assertTrue(result);
        assertEquals(0, shapeCollector.getFiguresQuantity());
        System.out.println(shapeCollector.getFiguresQuantity());

    }

    @Test
    public void testGetFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape figure1 = new Square("square",5);
        shapeCollector.addFigure(figure1);
        Shape retrievedFigure;
        retrievedFigure = shapeCollector.getFigure(0);
        assertEquals(figure1, retrievedFigure);
    }

    @Test
    public void testShowFigures(){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square("square", 4));
        shapeCollector.addFigure(new Triangle("triangle", 3.5, 4.5));
        shapeCollector.addFigure(new Circle("circle", 6));
        shapeCollector.showFigures();
    }

    @Test
    public void testRemoveNonExistingFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape figure1 = new Circle("circle", 10.5);
        shapeCollector.addFigure(figure1);
        boolean result = shapeCollector.removeFigure(figure1);
        assertFalse(result);
    }

    @Test
    public void testGetMinusFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        assertNull(shapeCollector.getFigure(-4));
    }

    @Test
    public void testGetFigureOutOfList(){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle("circle", 4));
        shapeCollector.addFigure(new Square("square", 2.5));
        shapeCollector.getFigure(5);
        assertNull(shapeCollector.getFigure(5));
    }

}
