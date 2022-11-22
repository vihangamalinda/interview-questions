package com.vihanga.palindrome.number;

public class PalindromeFinder {

    public PalindromeFinder() {

    }

    public boolean numFinder(int input) {

        int num = input;
        boolean isPalindrome = true;
        if (num < 0) {
            isPalindrome = false;
            return isPalindrome;
        } else if ((10 - num) > 0 || num == 0) {
            isPalindrome = true;
            return isPalindrome;
        }
        String numberString = String.valueOf(num);
//        System.out.println("numberString: "+numberString);
        String[] stringArr = numberString.split("");
//        int j = 0;
//        String lastCheckIndex = stringArr[stringArr.length-1];
//        String firstCheckIndex = stringArr[0];
        int lastCheckIndex = stringArr.length - 1;


//        System.out.println("Number: "+num+" lastCheckIndex : "+lastCheckIndex);
//        System.out.println("Number: "+num+" firstCheckIndex : "+firstCheckIndex);

        for (int firstCheckIndex = 0; (firstCheckIndex < lastCheckIndex) && (firstCheckIndex != lastCheckIndex); firstCheckIndex++) {

            if (!stringArr[firstCheckIndex].equalsIgnoreCase(stringArr[lastCheckIndex])) {
                isPalindrome = false;
                return isPalindrome;
            }
            lastCheckIndex--;
        }
        return isPalindrome;
    }
}
