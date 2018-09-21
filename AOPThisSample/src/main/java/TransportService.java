package com.xgj.aop.spring.advisor.aspectJ.function.thisFun;

import com.xgj.aop.spring.advisor.aspectJ.function.thisFun.ITransportService;

public class TransportService implements ITransportService {

    @Override
    public void doTransport() {
        System.out.println("doTransport executed");
    }

}