package com.zjg.aspectSample;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class SimpleAspect {
    @Pointcut("execution(* com.zjg.aspectSample.*.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before() {
        //如果需要这里可以取出参数进行处理
        //Object[] args = joinPoint.getArgs();
        System.out.println("before aspect executing");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after aspect executed");
    }

    @AfterReturning(pointcut = "pointCut()", returning = "returnVal")
    public void afterReturning(Object returnVal) {
        if(returnVal != null) {
            System.out.println("afterReturning executed, return result is "
                    + returnVal.toString());
        }else{
            System.out.println("afterReturning executed, return result is " +
                    "null");
        }
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around start..");
        try {
            pjp.proceed();
        } catch (Throwable ex) {
            System.out.println("error in around");
            throw ex;
        }
        System.out.println("around end");
    }

    @AfterThrowing(pointcut = "pointCut()", throwing = "error")
    public void afterThrowing(JoinPoint jp, Throwable error) {
        System.out.println("error:" + error);
    }
}