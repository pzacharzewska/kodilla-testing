package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(5,3);
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Exception!");
        } finally {
            System.out.println("Throws is for super class");
        }
    }
}
