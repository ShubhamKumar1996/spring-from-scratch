package com.example.springcoreproject2_3ReplacingXmlWithAnnotations;

public class Fruit {
    private int fruitId;
    private Mango mango;
    public Fruit() {
        super();
    }
    public Fruit(int fruitId, Mango mango) {
        super();
        this.fruitId = fruitId;
        this.mango = mango;
    }
    public int getFruitId() {
        return fruitId;
    }
    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }
    public Mango getMango() {
        return mango;
    }
    public void setMango(Mango mango) {
        this.mango = mango;
    }
    @Override
    public String toString() {
        return "Fruit [fruitId=" + fruitId + ", mango=" + mango + "]";
    }
}
