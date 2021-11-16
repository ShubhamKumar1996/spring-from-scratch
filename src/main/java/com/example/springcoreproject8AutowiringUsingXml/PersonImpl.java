package com.example.springcoreproject8AutowiringUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonImpl {
    /* Autowiring byName, byType, constructor using Xml Configuration */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("PersonConfig.xml");
        //Person person1 = (Person) context.getBean("person1");
        Person person2 = context.getBean("person3", Person.class);
        System.out.println(person2);
    }
}
