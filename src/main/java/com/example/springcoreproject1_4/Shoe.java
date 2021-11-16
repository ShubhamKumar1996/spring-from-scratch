package com.example.springcoreproject1_4;

public class Shoe {
    private int shoeId;
    private String shoeBrand;
    public Shoe(int shoeId, String shoeBrand) {
        super();
        this.shoeId = shoeId;
        this.shoeBrand = shoeBrand;
    }
    @Override
    public String toString() {
        return "Shoe [shoeId=" + shoeId + ", shoeBrand=" + shoeBrand + "]";
    }
}