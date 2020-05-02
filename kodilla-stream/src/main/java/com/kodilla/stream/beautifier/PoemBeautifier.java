package com.kodilla.stream.beautifier;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PoemBeautifier {
    public void beautify(String textToBeautify, String textForBeautifying, PoemDecorator poemDecorator) {
        String finalText = poemDecorator.decorate(textToBeautify, textForBeautifying);
        System.out.println("Text after beautifying: " + finalText);
    }

    public static String addRandomLetterToTheEnd (String tekst1, String tekst2) {
        List<String> letterList = Arrays.asList("A", "B", "C", "D", "E");
        Random generator = new Random();
        String tekst3 = (tekst1 + tekst2) + letterList.get(generator.nextInt(letterList.size()));
        return tekst3;

    }

    public static String addRandomLetterAtTheBeginning (String tekst1, String tekst2) {
        List<String> letterList2 = Arrays.asList("F", "G", "H", "I", "J");
        Random generator2 = new Random();
        String tekst4 = letterList2.get(generator2.nextInt(letterList2.size())) + (tekst1 + tekst2);
        return tekst4;
    }

}