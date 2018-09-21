package com.zjg.junitSample;

public class Student {
    private String name;

    public Student(){

    }
    public String getName(){
        System.out.println("getName: " + name);
        return name;
    }

    public void setName(String name){
        System.out.println("setName: " + name);
        this.name = name;
    }

}
