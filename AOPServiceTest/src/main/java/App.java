package me.laiyijie.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.laiyijie.demo.service.UserServiceImpl;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        UserServiceImpl userService = context.getBean(UserServiceImpl.class);

        System.out.println(userService.login("lailai"));

        context.close();
    }
}
