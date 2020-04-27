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
            oddNumbers.add(0);
            oddNumbers.add(2);
            oddNumbers.add(4);
            oddNumbers.add(6);
            oddNumbers.add(8);
            oddNumbers.add(10);
            oddNumbers.add(12);
            oddNumbers.add(14);
            oddNumbers.add(16);
            oddNumbers.add(18);

        ArrayList<Integer> result2 = oddNumbersExterminator2.exterminate(numbers2);
        System.out.println("Testing whether two lists are equals in progress...");
        Assert.assertEquals(result2, oddNumbers);

    }
}
