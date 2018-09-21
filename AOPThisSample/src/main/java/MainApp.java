package com.xgj.aop.spring.advisor.aspectJ.function.thisFun;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xgj.aop.spring.advisor.aspectJ.function.thisFun.BussinessService;
import com.xgj.aop.spring.advisor.aspectJ.function.thisFun.ITransportService;

public class MainApp {
    private ApplicationContext applicationContext;

    @Test
    public void test() {
        applicationContext = new ClassPathXmlApplicationContext(
                "classpath:Beans.xml");

        BussinessService bussinessService = (BussinessService) applicationContext
                .getBean("bussinessService");
        // 匹配 this
        bussinessService.doBussiness();
        // 匹配 this
        bussinessService.doAnother();

        // 匹配 this
        ((ITransportService) bussinessService).doTransport();

    }
}