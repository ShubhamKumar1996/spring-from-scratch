package com.example.springcoreproject1_5BeanLifecycleImplementationUsingXml;

public class Motorcycle {
    private double price;

    public Motorcycle() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Motorcycle(double price) {
        super();
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Motorcycle [price=" + price + "]";
    }

    public void init() {
        System.out.println("Inside Init Method");
    }

    public void destroy() {
        System.out.println("Inside destroy method");
    }
}
