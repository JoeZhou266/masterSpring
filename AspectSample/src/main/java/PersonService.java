package com.zjg.aspectSample;

public class PersonService {

    public String addPerson(String personName) {
        System.out.println("add person " + personName);
        return personName;
    }

    public boolean deletePerson(String personName) {
        System.out.println("delete person " + personName) ;
        return true;
    }

    public void editPerson(String personName) {
        System.out.println("edit person " + personName);
        throw new RuntimeException("edit person throw exception");
    }

}