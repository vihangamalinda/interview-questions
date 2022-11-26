package com.vihanga.interview.prep.string;

public class Operator {

    public static void main(String[] args) {
        String output = firstLetterCapital("Hi, this is Vihanga malinda.");
        System.out.println(output);
    }

    public static String firstLetterCapital(String input) {
        String[] normalizedArr = input.toLowerCase().trim().split(" ");
        StringBuilder sentence = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (String x : normalizedArr) {
            word.append(x);
            word.replace(0, 1, String.valueOf(x.charAt(0)).toUpperCase());
//        System.out.println("Word: "+ word.toString());
            sentence.append(word).append(" ");
            word.delete(0, word.length());
        }
        return sentence.toString().trim();
    }
}
