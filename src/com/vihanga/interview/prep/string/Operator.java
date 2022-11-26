package com.vihanga.interview.prep.string;

public class Operator {

    public static void main(String[] args) {
//        String output = firstLetterCapital("Hi, this is Vihanga malinda.");
//        System.out.println(output);
        stringMutation("ynmnimj mbgjkiuim");
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
