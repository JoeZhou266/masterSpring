package com.xgj.aop.spring.advisor.aspectJ.function.thisFun;

import org.springframework.stereotype.Component;

import com.xgj.aop.spring.advisor.aspectJ.function.thisFun.IBussinessService;

/**
 *
 *
 * @ClassName: BussinessService
 *
 * @Description: @Component标注的bean
 *
 * @author: Mr.Yang
 *
 * @date: 2017年9月5日 下午8:18:03
 */

@Component
public class BussinessService implements IBussinessService {

    @Override
    public String doBussiness() {
        System.out.println("doBussiness executed");
        return "success";
    }

    public String doAnother() {
        System.out.println("doAnother executed");
        return "success";
    }
}