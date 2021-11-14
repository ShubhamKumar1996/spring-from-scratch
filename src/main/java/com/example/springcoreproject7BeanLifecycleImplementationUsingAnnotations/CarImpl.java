package com.example.springcoreproject7BeanLifecycleImplementationUsingAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarImpl {
    /* Implementing Bean lifecycle methods using Annotation */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("CarConfig.xml");
        context.registerShutdownHook();
        Car car1 = (Car) context.getBean("car1");
        System.out.println(car1);
    }
}
