package com.zjg;

import com.zjg.NaiveWaiter;
import com.zjg.WaiterDelegate;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class AOPAdvisorDynamicTest {

    public static void main(String []args)
    {
        try{
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            Resource[] resource = resolver.getResources("classpath:aop.xml");

            DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
            XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
            reader.loadBeanDefinitions(resource);
            NaiveWaiter waiter = (NaiveWaiter) factory.getBean("waiter");
            waiter.greetTo("John");

            WaiterDelegate wd = new WaiterDelegate();
            wd.setWaiter(waiter);
            wd.service("John");
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }


}
