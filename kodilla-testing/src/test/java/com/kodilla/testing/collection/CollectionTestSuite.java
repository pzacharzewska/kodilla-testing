package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers= new ArrayList<>();
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing if ArrayList is empty in progress...");
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator2 = new OddNumbersExterminator();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int n = 0; n < 20; n++) {
            numbers2.add(n);
        }

        ArrayList<Integer> oddNumbers = new ArrayList<>();
            oddNumbers.add(1);
            oddNumbers.add(3);
            oddNumbers.add(5);
            oddNumbers.add(7);
            oddNumbers.add(9);
            oddNumbers.add(11);
            oddNumbers.add(13);
            oddNumbers.add(15);
            oddNumbers.add(17);
            oddNumbers.add(19);

        ArrayList<Integer> result2 = oddNumbersExterminator2.exterminate(numbers2);
        System.out.println("Testing whether two lists are equals in progress...");
        Assert.assertEquals(result2, oddNumbers);

    }
}
