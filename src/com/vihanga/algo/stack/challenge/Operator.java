package com.vihanga.algo.stack.challenge;

import java.util.Stack;

public class Operator {

    public static boolean hasMatchingParentheses(String s){
        Stack<Character> stringStack = new Stack<>();

        for (int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(currentChar== '(') {
                stringStack.push(currentChar);
            }else if(currentChar==')'){
                if(!stringStack.isEmpty()){
                    stringStack.pop();
                }else {
                    return false;
                }
            }

        }



        return stringStack.isEmpty();
    }
}
