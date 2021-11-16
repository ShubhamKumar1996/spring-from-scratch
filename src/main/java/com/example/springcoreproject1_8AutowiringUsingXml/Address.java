package com.example.springcoreproject1_8AutowiringUsingXml;

public class Address {
    private String village;
    private String State;
    private int pincode;
    public Address() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Address(String village, String state, int pincode) {
        super();
        this.village = village;
        State = state;
        this.pincode = pincode;
    }
    public String getVillage() {
        return village;
    }
    public void setVillage(String village) {
        this.village = village;
    }
    public String getState() {
        return State;
    }
    public void setState(String state) {
        State = state;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    @Override
    public String toString() {
        return "Address [village=" + village + ", State=" + State + ", pincode=" + pincode + "]";
    }

}
