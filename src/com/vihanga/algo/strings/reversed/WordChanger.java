package com.vihanga.algo.strings.reversed;

public class WordChanger {

    public static void main(String[] args) {

        String sentence = "HI, I'm vihanga. How Are, youuuu.";
        System.out.println(performOperation(sentence));
    }

    private static String wordReversed(String word){

//        String input = word.trim();
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse().toString();
    }

    private static String performOperation(String sentence){
        if(sentence.isEmpty() || sentence ==null){
            return sentence;
        }
        String data = sentence.trim().replaceAll(","," ");
        String [] dataArr = data.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0;i< dataArr.length-1;i++){
            stringBuilder.append(wordReversed(dataArr[i]));
            if(i != dataArr.length-2){
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }
}
