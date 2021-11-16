package com.example.springcoreproject9AutowiringUsingAnnotation;

public class Address {
    private String village;
    private String state;
    private int pinCode;
    public Address() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Address(String village, String state, int pinCode) {
        super();
        this.village = village;
        this.state = state;
        this.pinCode = pinCode;
    }
    public String getVillage() {
        return village;
    }
    public void setVillage(String village) {
        this.village = village;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getPinCode() {
        return pinCode;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    @Override
    public String toString() {
        return "Address [village=" + village + ", state=" + state + ", pinCode=" + pinCode + "]";
    }

}
