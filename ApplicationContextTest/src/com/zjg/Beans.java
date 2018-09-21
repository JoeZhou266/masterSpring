package com.zjg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zjg.Car;

import javax.annotation.PostConstruct;

@Configuration
public class Beans {

    @Bean(name = "car")
    public Car buildCar() {
        Car car = new Car();
        car.setBrand("红旗CA72");
        car.setMaxSpeed(400);
        return car;
    }


}
