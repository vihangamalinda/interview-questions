package com.vihanga.algo.hash.set;

import com.vihanga.algo.hash.set.challenge.Operator;

import java.util.HashSet;
import java.util.List;

public class Algorithms {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();

        stringHashSet.add("536");
        stringHashSet.add("4367");
        stringHashSet.add("5367");
        stringHashSet.add("37");

        System.out.println(stringHashSet.contains("5367"));
        System.out.println(stringHashSet.contains("1"));


        List<Integer> result =Operator.differenceOfTwoArrays(new int[]{12,3,5,6,3},new int[]{3,5,3,15,22});
        System.out.println();
        result.forEach(val-> System.out.println(val));

    }
}
