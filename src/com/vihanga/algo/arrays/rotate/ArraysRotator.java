package com.vihanga.algo.arrays.rotate;

import java.util.Arrays;

public class ArraysRotator {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int [] result =leftRotator(arr);
//        System.out.println("arr: "+arr.length);
//        Arrays.stream(arr).forEach(value -> System.out.println(value));
//        System.out.println("result: "+result.length);
//        Arrays.stream(result).forEach(value -> System.out.println(value));

        leftRotator2(arr);
        System.out.println("LeftRotator 2: ");
        Arrays.stream(arr).forEach(value -> System.out.println(value));
        rightRotator(arr);
        System.out.println("RightRotator: ");
        Arrays.stream(arr).forEach(value -> System.out.println(value));
        System.out.println("Right Rotator 2: ");
        rightRotator2(arr);
        Arrays.stream(arr).forEach(value -> System.out.println(value));



    }

    private static int[] leftRotator(int[] arr){
//        int[] arr = {1,2,3,4,5,6}
//        int[] rotatedArr = {2,3,4,5,6,1}
        int [] result = new int[arr.length];
        int firstElement = arr[0];
//        System.out.println();
        for (int i=0;i<=arr.length-1;i++){
//            System.out.println(i);
            if(i!=arr.length-1){
                result[i]=arr[i+1];
            }else {
//                System.out.println("i");
                result[i] =firstElement;
            }
        }

        return result;

    }

    public  static void leftRotator2(int[]arr){
        int firstElement= arr[0];
        for (int i=1;i<=arr.length;i++){
//            System.out.println(i);
           if(i!= arr.length){
               arr[i-1]=arr[i];
           }else {
               arr[i-1] =firstElement;
           }
        }

    }

    public static void rightRotator(int arr[]){
        int lastElement = arr[arr.length-1];
        for (int i =arr.length-1;i>=0;i--){

            if(i!=0){
                arr[i] =arr[i-1];
            }else {
                arr[i]=lastElement;
            }
        }

    }

    public static void rightRotator2(int arr[]){
        int lastElement = arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] =lastElement;

    }
}
