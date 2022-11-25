package com.vihanga.algo.queue;

import com.vihanga.algo.queue.challenge.Operator;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
//        Queue<Integer> integerQueue = new LinkedList<>();
//        integerQueue.add(123);
//        integerQueue.add(13);
//        integerQueue.add(78);
//        integerQueue.add(1);
//        integerQueue.add(0);
//        integerQueue.add(6);
//        integerQueue.add(26);
//
//        display(integerQueue);
//
//        System.out.println(integerQueue.remove());
//        System.out.println(integerQueue.peek());
//        display(integerQueue);

        Operator.printBinaryNumbers(3);
    }

    public static void display(Queue<Integer> integerQueue){
        integerQueue.stream().forEach((val->{
            System.out.println(val);
        }));

        System.out.println();

    }

}
