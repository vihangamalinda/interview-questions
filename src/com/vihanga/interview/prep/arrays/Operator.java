package com.vihanga.interview.prep.arrays;

import java.util.Arrays;

public class Operator {
    public static void main(String[] args) {
//        int[] intArr = {12,40,-7,9,-105,-2,7};
//        findMaxProduct(intArr);
//        System.out.println();
//        findMaxProduct2(intArr);
//        System.out.println();
//        findMaxProduct3(intArr);

        Node<Integer> head = buildNode(8);
        Node<Integer> node01 = buildNode(16);
        Node<Integer> node02 = buildNode(43);
        Node<Integer> node03 = buildNode(23);
        Node<Integer> node04 = buildNode(85);
        Node<Integer> node05 = buildNode(68);
        Node<Integer> node06 = buildNode(83);

        head.setNextPointer(node01);
        node01.setNextPointer(node02);
        node02.setNextPointer(node03);
        node03.setNextPointer(node04);
        node04.setNextPointer(node05);
        node05.setNextPointer(node06);


        displayNode(head);
        System.out.println();
        deleteTheMiddleElement(head);
        System.out.println();
        displayNode(head);






    }

    //Maximum of 2 product of two numbers on unsorted array
    private static void findMaxProduct(int[] arr ){
        if(arr.length<2){
            System.out.println("Array need two have a least two elements.");
            return;
        }
        int max = Integer.MIN_VALUE;
        int val1 = 0, val2=0;

        for (int i=0;i<arr.length;i++){
            System.out.println();
            for (int j=i+1;j<arr.length;j++){
                System.out.println(j);
                if(arr[i]*arr[j]>max){
                    max =arr[i]*arr[j];
                    val1=arr[i];
                    val2=arr[j];
                }
            }
        }
        System.out.println("Max product: "+max);
        System.out.println("Val 01: "+val1+" Val 02: "+val2);

    }

    //Maximum of 2 product of two numbers on unsorted array
    private static void findMaxProduct2(int[] arr){
        if(arr.length<2){
            System.out.println("Array need two have a least two elements.");
            return;
        }
        int maxValProduct = Integer.MIN_VALUE;
        int minValProduct = Integer.MIN_VALUE;

      Arrays.sort(arr);

      maxValProduct= arr[arr.length-1]*arr[arr.length-2];
      minValProduct=arr[0]*arr[1];

      if(maxValProduct>minValProduct){
          System.out.println("Max product: "+maxValProduct);
      }else {
          System.out.println("Max product: "+minValProduct);
      }

        System.out.println("maxValProduct "+maxValProduct);
        System.out.println("minValProduct "+minValProduct);



    }

    //Maximum of 2 product of two numbers on unsorted array
    private static void findMaxProduct3(int[] arr){
        if(arr.length<2){
            System.out.println("Array need two have a least two elements.");
            return;
        }

        int max1=arr[0];
        int max2=Integer.MIN_VALUE;

        int min1=arr[0];
        int min2=Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){

            if(arr[i]<min1){
                min2 = min1;
                min1= arr[i];
            }else if(arr[i]<min2 & arr[i] !=min1){
                min2=arr[i];
            }else if(arr[i]>max1){
                max2 = max1;
                max1=arr[i];
            }else if(arr[i]>max2 & arr[i]!=max1){
                max2 =arr[i];
            }
        }

        System.out.println("min1*min2: "+min1 +" "+min2 +" product :" +min1*min2);
        System.out.println("max1*max2: "+max1+" "+max2+" product: "+max1*max2 );

        if(min1*min2 >max1*max2){
            System.out.println("min1*min2: "+min1 +" "+min2 +" product :" +min1*min2);
        }else {
            System.out.println("max1*max2: "+max1+" "+max2+" product: "+max1*max2 );
        }


    }

//    Deleting the middle element of a LinkedList
    private static void deleteTheMiddleElement(Node head){
//        Base case
        if(head == null || head.getNextPointer() == null){
            System.out.println("Need more than two nodes :(");
            return;
        }
        Node<Integer> slow=head;
        Node<Integer> fast =head;
        Node<Integer> temp=head;

        while (fast!=null & fast.getNextPointer() != null){
            temp =slow;
            slow=slow.getNextPointer(); //+1
            fast=fast.getNextPointer().getNextPointer();//+2
        }
//   same idea->      slow.getNextPointer() == temp.getNextPointer().getNextPointer();
        temp.setNextPointer(slow.getNextPointer());
    };

    private static void displayNode(Node<Integer> node){

        while (node!=null){
            System.out.print(node.getData()+"-> ");
            node = node.getNextPointer();

        }
    }
    private static  Node<Integer> buildNode(Integer data){
        Node<Integer> node = new Node<>(data);
        node.setNextPointer(null);
        return node;
    }
}
