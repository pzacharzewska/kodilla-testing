package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Minka", "ABC", (textToBeautify, textForBeautifying) -> textToBeautify+textForBeautifying);
        poemBeautifier.beautify("Minka", "ABC", (textToBeautify, textForBeautifying) -> textForBeautifying+textToBeautify);
        poemBeautifier.beautify("Minka", "",(textToBeautify, textForBeautifying) -> (textForBeautifying+textToBeautify).toUpperCase());
        poemBeautifier.beautify("Minka", " to mój kot.", ((textToBeautify, textForBeautifying) -> (textToBeautify+textForBeautifying).replace('o','u')));
        poemBeautifier.beautify("Minka", "", ((textToBeautify, textForBeautifying) -> textToBeautify.concat(" to mój kot.")));
        poemBeautifier.beautify("Minka", "", PoemBeautifier::addRandomLetterToTheEnd);
        poemBeautifier.beautify("Minka", " to mój kot.", PoemBeautifier::addRandomLetterAtTheBeginning);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }

}
