package com.zjg;

import org.aopalliance.intercept.MethodInvocation;

public class GreetingInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
               //获取目标方法的入参
        	        Object[] args=methodInvocation.getArguments();
        	        //获取方法名称
        	        String clickName= (String) args[0];
        	        System.out.println("GreetingInterceptor：before: How are " +
                            "you!");
        	        //利用反射机制来调用目标方法
        	        Object object=methodInvocation.proceed();
        	        System.out.println("GreetingInterceptor: after: please " +
                            "enjoy youself!");
        	        return object;
        	    }

}
