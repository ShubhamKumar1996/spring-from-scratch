package com.example.springcoreproject2_1QualifierInAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopImpl {
    /* Importance of Qualifier in Autowiring */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("LaptopConfig.xml");
        Laptop laptop1 = context.getBean("laptop1", Laptop.class);
        System.out.println(laptop1);
    }
}
