package com.zjg;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    /**
     * 前置增强方法
     * 当该方法发生异常时，将阻止目标方法的执行
     * @param method 目标类方法
     * @param objects 目标类方法入参
     * @param o 目标类对象实例
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        String clientName=(String)objects[0];
        System.out.println("How Are You! mr."+clientName);
    }
}
