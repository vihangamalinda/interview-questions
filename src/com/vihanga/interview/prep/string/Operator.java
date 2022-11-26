package com.vihanga.interview.prep.string;

import java.util.Arrays;

public class Operator {

    public static void main(String[] args) {
//        String output = firstLetterCapital("Hi, this is Vihanga malinda.");
//        System.out.println(output);
//        stringMutation("ynmnimj mbgjkiuim");

        String val= "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has" +
                " been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of " +
                "type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the " +
                "leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with " +
                "the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.";

        findSentenceCount(val);
        findWordCount(val);
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


    private static void findSentenceCount(String s){
        String[] sentence = s.trim().split("\\.");
        System.out.println("Sentences count: "+sentence.length);
//        Arrays.stream(sentence).forEach(val-> System.out.println(val));

        System.out.println("character count: "+s.length());


    }
    private static void findWordCount(String s){
       String[] words =  s.trim().split(" |-");
        System.out.println("Word count: "+words.length);
        System.out.println(Arrays.asList(words));

    }

    public static void stringMutation(String s){
        StringBuilder builder = new StringBuilder(s);
        builder.append("viha bgw");
        builder.append("nmnkjjnbg");
        System.out.println();
        System.out.println("length: "+builder.length()+ " , value: "+builder.toString());


        builder.insert(5,"NEw Letter");
        System.out.println();
        System.out.println("length: "+builder.length()+ " , value: "+builder.toString());

        System.out.println();
        System.out.println("char at 7:  "+builder.charAt(7));
        System.out.println("char at 33:  "+builder.charAt(33));


        builder.delete(7,33);
        System.out.println();
        System.out.println("length: "+builder.length()+ " , value: "+builder.toString());


        builder.deleteCharAt(0);
        System.out.println();
        System.out.println("length: "+builder.length()+ " , value: "+builder.toString());




    }
}
