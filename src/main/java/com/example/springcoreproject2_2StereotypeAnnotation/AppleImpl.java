package com.example.springcoreproject2_2StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppleImpl {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AppleConfig.xml");
        Apple apple = context.getBean("apple", Apple.class);
        System.out.println(apple);
    }
}
