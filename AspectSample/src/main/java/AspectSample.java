package com.zjg.aspectSample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjg.aspectSample.PersonService;

public class AspectSample {
    public static void main(String args[]){
        ApplicationContext appContext = new
                ClassPathXmlApplicationContext("classpath:AOP.xml");
        PersonService personService =
                (PersonService)appContext.getBean("PersonService");
        String personName = "Jim";
        personService.addPerson(personName);
        personService.deletePerson(personName);
        personService.editPerson(personName);
        ((ClassPathXmlApplicationContext)appContext).close();
    }
}
