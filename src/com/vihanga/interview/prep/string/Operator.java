package com.vihanga.interview.prep.string;

import java.util.Arrays;
import java.util.Locale;

public class Operator {

    public static void main(String[] args) {
//        String output = firstLetterCapital("Hi, this is Vihanga malinda.");
//        System.out.println(output);
//        stringMutation("ynmnimj mbgjkiuim");

//        String val= "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has" +
//                " been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of " +
//                "type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the " +
//                "leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with " +
//                "the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
//                "software like Aldus PageMaker including versions of Lorem Ipsum.";
//
//        findSentenceCount(val);
//        findWordCount(val);
//        palindrome  eg: civic,racecar
//        boolean result = palindromeChecker("racecar");
//        System.out.println(result);
//
        String sample = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        findVowelsConsonantCount(sample);
        System.out.println();
        findVowelsConsonantCount2(sample);
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

    private static boolean palindromeChecker(String s){
        //Base Case
        if(s.length()==0){
            return false;
        }
        String input = s.trim().toLowerCase();
        String[] letters = input.split("");
        System.out.println(Arrays.asList(letters));
        for (int i=0;i< letters.length/2;i++){
            System.out.println(i);
            if( !letters[i].equals(letters[letters.length-1-i]) ){
                return false;
            }
        }
        return true;
    }

//    Assume there are no numerics only characters and spaces
    private static void findVowelsConsonantCount(String s){
        String input = s.trim().toLowerCase().replaceAll(" ","");
       char[] charArray =input.toCharArray();
       String[] vowel = new String[]{"a","e","i","o","u"};
        int vowelCount =0;
       for (String x:vowel){
           for (char y: charArray){
               if(x.charAt(0) == y){
                   vowelCount ++;
               }
           }
       }
        System.out.println("Without removing middle spaces character length: "+s.trim().toLowerCase().length());
        System.out.println("Total character amount: "+input.length());
        System.out.println("Vowel character amount: "+vowelCount);
        System.out.println("Consonant character amount: "+(input.length()-vowelCount));

    }

//    Assume there are no numerics only characters and spaces
    private static void findVowelsConsonantCount2(String s){
        String input = s.trim().toLowerCase().replaceAll(" ","");
        char[] charArr = input.toCharArray();
        String vowels = "aeiou";
        int vowelCount = 0;

        for (char x: charArr){
            if(vowels.indexOf(x) != -1){
                vowelCount++;
            }
        }

        System.out.println("Without removing middle spaces character length: "+s.trim().toLowerCase().length());
        System.out.println("Total character amount: "+input.length());
        System.out.println("Vowel character amount: "+vowelCount);
        System.out.println("Consonant character amount: "+(input.length()-vowelCount));

    }
}
