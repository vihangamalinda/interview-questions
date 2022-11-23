package com.vihanga.algo.linked.list.custom;

public class CustomLinkedList {

    public Node head;

    public CustomLinkedList(){

    }

    public void displayContent(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" -> ");
            current= current.next;
        }
        System.out.println();
    }
}
