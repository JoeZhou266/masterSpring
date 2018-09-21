package com.zjg;

import com.zjg.Waiter;

public class NativeWaiter implements Waiter {

    public void greetTo(String name) {
        System.out.println("greet to" + name + "...");
    }

    public void serverTo(String name) {
        System.out.println("serving" + name + "...");
    }

}

