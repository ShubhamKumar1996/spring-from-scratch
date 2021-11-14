package com.example.springcoreproject7BeanLifecycleImplementationUsingAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car {
    private int price;

    public Car() {
        super();
    }

    public Car(int price) {
        super();
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [price=" + price + "]";
    }

    @PostConstruct
    public void initialization() {
        System.out.println("Inside Post Construct");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Inside Pre Destroy");
    }
}