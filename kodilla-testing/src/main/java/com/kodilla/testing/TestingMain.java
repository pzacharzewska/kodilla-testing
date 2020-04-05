package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");

        }
        else{
            System.out.println("Error!");
        }

        System.out.println("Pierwszy test jednostkowy");

        Calculator calculator = new Calculator();
        int result1 = calculator.add(78,23);
        int result2 = calculator.subtract(78,23);

        System.out.println(result1);
        System.out.println(result2);
    }
}
