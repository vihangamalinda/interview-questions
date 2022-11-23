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

// Deleting the K th node from bak of the custom Linked list
    public CustomLinkedList deleteKElementFromBack(CustomLinkedList customLinkedList,int k){

        if(customLinkedList == null || customLinkedList.head ==null ){
            customLinkedList.head = null;
            return customLinkedList;
        }
        if (k==0){
            return customLinkedList;
        }

        Node fastTrack = customLinkedList.head;
        Node backTrack = customLinkedList.head;
        Node tempNode = null;

        int count =0;
        while (fastTrack !=null && fastTrack.next!=null){
            fastTrack = fastTrack.next;
            count ++;
        }
//        int numIteration = count-k;
//        while (numIteration>0){
//            backTrack = backTrack.next;
//            prevNode = backTrack;
//            numIteration--;
//        }
//
        int secondCount =0;
        int eliminationPoint = count-k;
        System.out.println("eliminationPoint: "+eliminationPoint);

        while (backTrack.next != null){
            if(secondCount ==eliminationPoint ){
                System.out.println(backTrack.data);
                backTrack.next =backTrack.next.next;

                backTrack =tempNode;
               break;

            }else {
                backTrack = backTrack.next;
            }
            secondCount++;
        }


//        prevNode.next = null;
        return customLinkedList;
    }

    public void deleteKElementFromBack2(CustomLinkedList customLinkedList, int k){
        if(customLinkedList.head == null || k==0){
            return ;
        }

        Node first = customLinkedList.head;
        Node second = customLinkedList.head;

        for (int i=0;i<k;i++){
            second  = second.next;
            if(second.next == null){
                if(i==k-1){
                    customLinkedList.head = customLinkedList.head.next;

                }
//                when 0<k>customLinkedList.length, does not modified the list
                return ;
            }
        }

        while (second.next != null){
            first = first.next;
            second = second.next;
        }

        first.next =first.next.next;
    }

}


