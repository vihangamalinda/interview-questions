package com.vihanga.algo.hash.set.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Operator {

    // Find items present int first array,but not in second array.
    public  static  List<Integer> differenceOfTwoArrays(int[] firstArr, int[] secondArr){
        List<Integer> missingValArr = new ArrayList<>();
        HashSet<Integer> integerHashSet = new HashSet<>();

        for(int x :secondArr){
            integerHashSet.add(x);
        }

        for (int y:firstArr){
            if(!integerHashSet.contains(y)){
               missingValArr.add(y);
            }
        }

return missingValArr;

    }
}
