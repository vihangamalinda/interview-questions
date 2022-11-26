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

//    Find if the linkedList have a cycle, where next point direct to a previous element.
    public static boolean hasCycle(CustomLinkedList customLinkedList){
        Node current = customLinkedList.getHead();

        if(customLinkedList == null || customLinkedList.getHead() ==null){
            System.out.println("Empty");
            return false;
        }

        HashSet<Integer> alreadyExistHashSet = new HashSet<>();
        while (current !=null){
            if(alreadyExistHashSet.contains(current.getData())){
                return true;
            }else {
                alreadyExistHashSet.add(current.getData());
            }

            current=current.getNextNode();

        }

        return false;
    }
}
