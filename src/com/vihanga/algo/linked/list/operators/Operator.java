package com.vihanga.algo.linked.list.operators;

import com.vihanga.algo.linked.list.custom.CustomLinkedList;
import com.vihanga.algo.linked.list.custom.Node;

public class Operator {

    public Operator(){

    }
    public CustomLinkedList deleteBackHalfLinkedList(CustomLinkedList customLinkedList){
        if(customLinkedList.head == null || customLinkedList.head ==null){
           customLinkedList.head =null;
          return customLinkedList;

        }
        Node slowNode =customLinkedList.head;
        Node fastNode =customLinkedList.head;
        Node prevNode = null;
        while (fastNode!= null && fastNode.next != null){
            fastNode = fastNode.next.next; //  +2 forward
            prevNode=slowNode;
            slowNode = slowNode.next; // +1 forward

        }
        prevNode.next = null;
     return    customLinkedList;
    }
}
