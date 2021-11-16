package com.example.springcoreproject9AutowiringUsingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HouseImpl {
    /* Autowiring using Annotation on Variable, constructor or setter */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("HouseConfig.xml");
        House house1 = context.getBean("house", House.class);
        System.out.println(house1);
    }
}
