package com.zjg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPAdviceTest {
    public static void main(String[] args){
        /*
        //java programe part 1: test AOPAdvice Test in java hard code
        //创建目标对象
        Waiter target=new NativeWaiter();
        //创建增强类对象
        BeforeAdvice advice= new GreetingBeforeAdvice();
        //创建代理工厂对象
        ProxyFactory factory=new ProxyFactory();
        //设置代理类
        factory.setTarget(target);
        //添加增强类
        factory.addAdvice(advice);
        //获取代理类
        Waiter proxy=(Waiter)factory.getProxy();
        //调用目标类方法
        proxy.greetTo("icarus");
        proxy.serverTo("icarus");
        */
        /*
        //java programe part 2: test AOPAdvice Test in aop.xml
        ApplicationContext context= new ClassPathXmlApplicationContext("aop.xml");
        Waiter waiter=context.getBean("waiter",Waiter.class);
        waiter.greetTo("icarus");
        waiter.serverTo("icarus");
        */
        /*
        //java programe part 3: test AOPAdvice after advice
        ApplicationContext context= new ClassPathXmlApplicationContext("aop.xml");
        Waiter waiter=context.getBean("waiter",Waiter.class);
        waiter.greetTo("icarus");
        waiter.serverTo("icarus");
        */
        /*
        //java programe part 4: test AOPAdvice around advice
        ApplicationContext context= new ClassPathXmlApplicationContext("aop.xml");
        Waiter waiter=context.getBean("waiter",Waiter.class);
        waiter.greetTo("icarus");
        waiter.serverTo("icarus");
        */




    }

}

