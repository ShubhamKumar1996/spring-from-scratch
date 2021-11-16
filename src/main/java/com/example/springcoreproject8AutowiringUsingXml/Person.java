package com.example.springcoreproject8AutowiringUsingXml;

public class Person {
    private Address address;

    public Person() {
        super();
    }

    public Person(Address address) {
        super();
        this.address = address;
        System.out.println("Autowiring using constructor");
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + "]";
    }

}

