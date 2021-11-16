package com.example.springcoreproject2_3ReplacingXmlWithAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FruitImpl {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Fruit fruit = context.getBean("getFruit", Fruit.class);
        System.out.println(fruit);
    }
}
