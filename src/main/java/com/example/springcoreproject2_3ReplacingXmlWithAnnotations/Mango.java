package com.example.springcoreproject2_3ReplacingXmlWithAnnotations;

public class Mango {
    private String color;

    public Mango() {
        super();
    }

    public Mango(String color) {
        super();
        this.color = color;
    }

    public String getColor() {
        return "Color of Mango is " + color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mango [color=" + color + "]";
    }

}
