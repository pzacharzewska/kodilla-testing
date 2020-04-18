package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer>numbers) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer temporaryValue :numbers) {
            if (temporaryValue % 2 != 0) {
                result.add(temporaryValue);
            }
        }
        return result;
    }
}
