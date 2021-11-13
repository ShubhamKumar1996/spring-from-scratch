package com.example.springcoreproject3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"LibraryConfig.xml", "BookConfig.xml"});
        Book book1 = (Book) context.getBean("book1");
        Library library1 = (Library) context.getBean("library1");
        System.out.println(library1);
    }
}
