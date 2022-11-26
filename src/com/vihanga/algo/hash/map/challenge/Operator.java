package com.vihanga.algo.hash.map.challenge;

import java.util.HashMap;

public class Operator {

    public static void displayElementFrequency(int []arr){
        HashMap<Integer,Integer> frequencyArr = new HashMap<>();

        for (int i=0; i< arr.length;i++){
//          Integer currentVal =  frequencyArr.get(arr[i]);
            if(!frequencyArr.containsKey(arr[i])){
                frequencyArr.put(arr[i],1);
            }else {
                frequencyArr.put(arr[i],frequencyArr.get(arr[i])+1);
            }
        }
        frequencyArr.forEach((key,val)-> System.out.println("(key:frequency)->"+key+" : "+val));

    }
}
