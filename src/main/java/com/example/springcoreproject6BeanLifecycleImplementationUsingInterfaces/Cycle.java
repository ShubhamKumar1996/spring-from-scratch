package com.example.springcoreproject6BeanLifecycleImplementationUsingInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cycle implements InitializingBean, DisposableBean {
    private int price;

    public Cycle() {
        super();
    }

    public Cycle(int price) {
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
        return "Cycle [price=" + price + "]";
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside init() method of Cycle");
    }

    public void destroy() throws Exception {
        System.out.println("Inside destroy() method of Cycle");
    }
}

