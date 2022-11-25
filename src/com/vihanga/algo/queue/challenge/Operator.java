package com.vihanga.algo.queue.challenge;

import java.util.LinkedList;
import java.util.Queue;

public class Operator {

    public static void printBinaryNumbers(int n) {
        if (n<0){
            System.out.println("Negative n value? ");
            return;
        }else if (n==0){
            System.out.println(0);
            return;
        }
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        for (int i=0;i<n;i++){
            Integer currentVal = integerQueue.remove();
            System.out.println(currentVal);
                integerQueue.add(currentVal*10);

                integerQueue.add(currentVal * 10 + 1);

        }

        //integerQueue.stream().forEach(val-> System.out.println(val));
    }
}
