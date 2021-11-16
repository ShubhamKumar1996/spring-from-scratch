package com.example.springcoreproject9AutowiringUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class House {
    private int houseNo;
    @Autowired
    private Address address;
    public House() {
        super();
    }
    /* @Autowired will do constructor injection
     * but here we also have primitive variable so Autowiring will not work here. */
    public House(int houseNo, Address address) {
        super();
        this.houseNo = houseNo;
        this.address = address;
        System.out.println("Constructor Injection");
    }
    public int getHouseNo() {
        return houseNo;
    }
    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }
    public Address getAddress() {
        return address;
    }
    /* @Autowired will do setter injection */
    public void setAddress(Address address) {
        this.address = address;
        System.out.println("Setter Injection");
    }
    @Override
    public String toString() {
        return "House [houseNo=" + houseNo + ", address=" + address + "]";
    }

}

