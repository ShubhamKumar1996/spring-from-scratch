package com.example.springcoreproject1_5BeanLifecycleImplementationUsingXml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MotorcycleImpl {
    /* Implementing lifecycle methods of Spring Bean using XML */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("MotorcycleConfig.xml");
        Motorcycle motorcycle1 = (Motorcycle) context.getBean("motorcycle1");
        System.out.println(motorcycle1);
        context.registerShutdownHook(); /* for calling destroy method */
    }
}
