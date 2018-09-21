package com.zjg;


public class ClassLoaderTest{
    public static void main(String[] args){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println("Current loader =" + classLoader);
        System.out.println("Parent loader = " + classLoader.getParent());
        System.out.println("Grand parent loader = " + classLoader.getParent().getParent());
    }
}

