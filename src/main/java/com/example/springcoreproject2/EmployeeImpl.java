package com.example.springcoreproject2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeImpl {
    /* Dependency Injection with Collections */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
    }
}
