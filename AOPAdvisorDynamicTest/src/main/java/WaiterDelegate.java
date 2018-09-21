package com.zjg;

import com.zjg.NaiveWaiter;

public class WaiterDelegate {
    private NaiveWaiter waiter;
	    public void service(String clientName) {
               waiter.greetTo(clientName);
               waiter.serveTo(clientName);
       	    }

          public void setWaiter(NaiveWaiter waiter) {
        	        this.waiter = waiter;
      	    }
	}
