package com.vihanga.algo.hash.map;

public class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id,String name,String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString(){

        return "( "+"id: "+id+",name: "+name+",department: "+department+")";
    }
}
