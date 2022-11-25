package com.vihanga.algo.hash.map;

import com.vihanga.algo.hash.map.challenge.Operator;

import java.util.HashMap;

public class Algorithms {
    public static void main(String[] args) {
        Employee employee01 = new Employee(12,"Vihanga","Malinda");
        Employee employee02 = new Employee(132," 1234","Fernmando");
        Employee employee03 = new Employee(124,"ttt","RR");

        HashMap<Integer,Employee> employeeHashMap = new HashMap<>();
        employeeHashMap.put(employee01.getId(),employee01);
        employeeHashMap.put(employee02.getId(),employee02);
        employeeHashMap.put(employee03.getId(),employee03);

        employeeHashMap.forEach((key,val)-> System.out.println("(Key : Value)-> "+key+" : "+val));
        System.out.println();

        Employee retrievedEmployee = employeeHashMap.get(132);

        if(retrievedEmployee != null){
            System.out.println("Employee Retrieved: "+ retrievedEmployee);
        }

        //challenge
        Operator.displayElementFrequency(new int[]{1,25,32,67,88,1,33,44,55,25,67,33,25});

    }


}
