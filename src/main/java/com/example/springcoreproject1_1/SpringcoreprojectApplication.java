package com.example.springcoreproject1_1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringcoreprojectApplication {
	/* Dependency Injection with primitive data types */
	public static void main(String[] args) {
//		SpringApplication.run(SpringcoreprojectApplication.class, args);
		System.out.println( "Hello World!" );
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");
		Employee employee1 = (Employee) context.getBean("employee1");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(employee1);
	}

}
