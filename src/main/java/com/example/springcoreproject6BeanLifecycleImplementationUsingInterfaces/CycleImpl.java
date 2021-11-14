package com.example.springcoreproject6BeanLifecycleImplementationUsingInterfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CycleImpl {
    /* Implementing Bean lifecycle using Interface */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("CycleConfig.xml");
        context.registerShutdownHook();
        Cycle cycle1 = (Cycle) context.getBean("cycle1");
        System.out.println(cycle1);
    }
}
