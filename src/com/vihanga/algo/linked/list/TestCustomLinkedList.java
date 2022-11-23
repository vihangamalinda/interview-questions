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

        customLinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        // fourth.next = null already.

        customLinkedList.displayContent();
        Operator operator = new Operator();
        operator.deleteBackHalfLinkedList(customLinkedList);
        customLinkedList.displayContent();
        System.out.println("Null list");
      CustomLinkedList customLinkedList1=  new CustomLinkedList();
        operator.deleteBackHalfLinkedList(customLinkedList1);
        System.out.println("   ...    ");
    }
}
