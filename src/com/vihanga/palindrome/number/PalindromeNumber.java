package com.vihanga.palindrome.number;

public class PalindromeNumber {
    public static void main(String [] args){
        PalindromeFinder palindromeFinder = new PalindromeFinder();
        int num =949;
       Boolean result = palindromeFinder.numFinder(num);
       System.out.println("Input Number: "+num +", isPalindrome: "+result);



    }
}
