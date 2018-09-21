package com.zjg.junitSample;

import com.zjg.junitSample.Student;

public class StudentDaoImpl {

    private Student student;

    public  StudentDaoImpl(){
        System.out.println("start initialize student");
        this.student = new Student();
    }
/*
    public void StudentDaoImpl(String name){
        student = new Student();
        student.setName(name);
    }
    */

    public void update(String name) {
        if(this.student == null)
        {
            System.out.println("Null Point at student");
        }
        else{
            this.student.setName(name);
        }
    }

}