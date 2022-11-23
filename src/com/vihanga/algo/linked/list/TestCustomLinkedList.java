package com.vihanga.algo.linked.list;

import com.vihanga.algo.linked.list.custom.CustomLinkedList;
import com.vihanga.algo.linked.list.custom.Node;
import com.vihanga.algo.linked.list.operators.Operator;

public class TestCustomLinkedList {

    public static void main(String[] args) {


        CustomLinkedList customLinkedList = new CustomLinkedList();

        Node firstNode = new Node(15);
        Node secondNode = new Node(12);
        Node thirdNode =  new Node(1);
        Node fourthNode = new Node(8);
        Node fifthNode = new Node(66);
        Node sixthNode = new Node(84);
        Node seventhNode = new Node(78);
        Node eighthNode = new Node(82);
        Node ninethNode = new Node(81);
        Node tenthNode = new Node(680);
        Node eleventhNode = new Node(87);
        Node twovelvethNode = new Node(28);
        Node thirteenNode = new Node(85);


        customLinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next =fifthNode;
        fifthNode.next =sixthNode;
        sixthNode.next = seventhNode;
        seventhNode.next =eighthNode;
        eighthNode.next = ninethNode;
        ninethNode.next =tenthNode;
        tenthNode.next=eleventhNode;
        eleventhNode.next = twovelvethNode;
        twovelvethNode.next = thirteenNode;
        // Last node (last.next = null) is  already null.

        /*
        // Training
        customLinkedList.displayContent();
        Operator operator = new Operator();
        operator.deleteBackHalfLinkedList(customLinkedList);
        customLinkedList.displayContent();
        System.out.println("Null list");
      CustomLinkedList customLinkedList1=  new CustomLinkedList();
        operator.deleteBackHalfLinkedList(customLinkedList1);
        System.out.println("   ...    ");
         */

//        Coding challenge
        customLinkedList.displayContent();
        Operator operator = new Operator();
     operator.deleteKElementFromBack(customLinkedList,5);
        customLinkedList.displayContent();
        operator.deleteKElementFromBack2(customLinkedList,2);
        customLinkedList.displayContent();
//        System.out.println(" ....... Base Cases ");
//        CustomLinkedList customLinkedList1 = new CustomLinkedList();
//        operator.deleteKElementFromBack(customLinkedList1,8);
//        customLinkedList1.displayContent();
//        System.out.println(" ....... Base cases");
//        operator.deleteKElementFromBack( customLinkedList,0);
//        customLinkedList.displayContent();
//        System.out.println(" .... ");


    }
}
