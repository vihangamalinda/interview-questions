package com.vihanga.interview.prep.hash;

import java.util.LinkedList;
import java.util.Queue;

public class Operator {
    public static void main(String [] args){
        printBinaryValues(4);
        System.out.println();
        printBinaryValues(0);
        System.out.println();
        printBinaryValues(-11);
        System.out.println();
        printBinaryValues(7);


    }

    private static void printBinaryValues(int n){
//        Base case
        if(n<0){
            System.out.println("Value is negative");
            return;
        }else if(n==0){
            System.out.println("0");
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        for (int i= 0 ; i<n;i++){
            Integer current = queue.remove();
            System.out.println(current);
            queue.add(current*10);
            queue.add(current*10+1);
        }

//        System.out.println();
//        queue.stream().forEach(System.out::println);

    }
}
