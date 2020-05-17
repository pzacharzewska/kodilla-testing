package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite implements ArrayOperations {

    @Test
    public void testGetAverage() {

        int[] numbers = new int[20];
        numbers[0] = 5;
        numbers[1] = 4;
        numbers[2] = 5;
        numbers[3] = 3;
        numbers[4] = 1;
        numbers[5] = 2;
        numbers[6] = 3;
        numbers[7] = 4;
        numbers[8] = 6;
        numbers[9] = 5;
        numbers[10] = 2;
        numbers[11] = 2;
        numbers[12] = 2;
        numbers[13] = 4;
        numbers[14] = 3;
        numbers[15] = 5;
        numbers[16] = 6;
        numbers[17] = 6;
        numbers[18] = 5;
        numbers[19] = 6;

        double average = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(3.95, average, 0.001);


    }
}
