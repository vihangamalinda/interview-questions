package com.vihanga.interview.prep.arrays;

public class Node<D> {
    private D data;
    private Node nextPointer;

    public Node(D data){
        this.data =data;
    }
    public D getData(){
        return this.data;
    }

    public Node getNextPointer() {
        return nextPointer;
    }

    public void setNextPointer(Node nextPointer) {
        this.nextPointer = nextPointer;
    }
}
