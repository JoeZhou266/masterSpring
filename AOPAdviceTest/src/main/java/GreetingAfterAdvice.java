package com.zjg;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class GreetingAfterAdvice  implements AfterReturningAdvice {
    /**
     * 后置增强代码实现
     * @param o 代理返回对象
     * @param method 目标对象方法
     * @param objects 目标对象方法参数
     * @param o1 目标对象
     * @throws Throwable
     */
    public void afterReturning(Object o, Method method, Object[] objects,
                               Object o1) throws Throwable {
        System.out.println("please enjoy youself!");
    }
}