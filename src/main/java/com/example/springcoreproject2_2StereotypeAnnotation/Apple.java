package com.example.springcoreproject2_2StereotypeAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Apple {
    @Value("Red")
    private String color;
    @Value("101")
    private int price;

    public Apple() {
    }

    public Apple(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
