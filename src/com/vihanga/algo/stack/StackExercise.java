package com.vihanga.algo.stack;

import com.vihanga.algo.stack.challenge.Operator;

import java.util.Stack;

public class StackExercise {
    public static void main(String[] args) {
//        Stack<Integer> integerStack = new Stack<>();
//
//        integerStack.push(134);
//        integerStack.push(5678);
//        System.out.println(integerStack.pop());
//        System.out.println(integerStack.peek());
//        System.out.println();
//        integerStack.push(1234);
//        integerStack.push(14);
//        integerStack.push(12);
//        integerStack.push(234);
//        integerStack.push(134);
//
//
//        while (!integerStack.isEmpty()){
//            System.out.println(integerStack.pop());
//        }

        System.out.println(")vihanga(): "+Operator.hasMatchingParentheses(")vihanga()"));
        System.out.println(")vihanga(): "+Operator.hasMatchingParentheses(")vihanga()"));
        System.out.println("()vihanga(): "+Operator.hasMatchingParentheses("()vihanga()"));
        System.out.println("Alg()ihanga(): "+Operator.hasMatchingParentheses("Alg()ihanga()"));
        System.out.println("Algo)vihanga(): "+Operator.hasMatchingParentheses("Algo)vihanga()"));

    }
}
