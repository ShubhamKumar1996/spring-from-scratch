package com.example.springcoreproject4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoeImpl {
    /* Dependency Injection with Constructor */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ShoeConfig.xml");
        Shoe shoe1 = (Shoe) context.getBean("shoe1");
        System.out.println(shoe1);
    }
}
