package com.vihanga.algo.hash.set;

import com.vihanga.algo.hash.set.challenge.CustomLinkedList;
import com.vihanga.algo.hash.set.challenge.Node;
import com.vihanga.algo.hash.set.challenge.Operator;

import java.util.HashSet;
import java.util.List;

public class Algorithms {
    public static void main(String[] args) {
//
//        HashSet<String> stringHashSet = new HashSet<>();
//
//        stringHashSet.add("536");
//        stringHashSet.add("4367");
//        stringHashSet.add("5367");
//        stringHashSet.add("37");
//
//        System.out.println(stringHashSet.contains("5367"));
//        System.out.println(stringHashSet.contains("1"));
//
//
//        List<Integer> result =Operator.differenceOfTwoArrays(new int[]{12,3,5,6,3},new int[]{3,5,3,15,22});
//        System.out.println();
//        result.forEach(val-> System.out.println(val));

        CustomLinkedList noCycleCustomLinkedList = new CustomLinkedList();
        Node node01 = new Node(5678);
        Node node02 = new Node(578);
        Node node03 = new Node(678);
        Node node04 = new Node(567);


        noCycleCustomLinkedList.setHead(node01);
        node01.setNextNode(node02);
        node02.setNextNode(node03);
        node03.setNextNode(node04);
        System.out.println();
        System.out.println("noCycleCustomLinkedList: "+ Operator.hasCycle(noCycleCustomLinkedList));

        CustomLinkedList cycledCustomLinkedList = new CustomLinkedList();
        cycledCustomLinkedList.setHead(node01);
        node03.setNextNode(node02);
        System.out.println();
        System.out.println("cycledCustomLinkedList: "+Operator.hasCycle(cycledCustomLinkedList));
        System.out.println(".....");



    }
}
