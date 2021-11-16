package com.example.springcoreproject2_1QualifierInAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Laptop {
    private int laptopId;
    @Autowired
    @Qualifier("hardDisk2")
    private HardDisk harddisk;
    public Laptop() {
        super();
    }
    public Laptop(int laptopId, HardDisk harddisk) {
        super();
        this.laptopId = laptopId;
        this.harddisk = harddisk;
    }
    public int getLaptopId() {
        return laptopId;
    }
    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }
    public HardDisk getHarddisk() {
        return harddisk;
    }
    public void setHarddisk(HardDisk harddisk) {
        this.harddisk = harddisk;
    }
    @Override
    public String toString() {
        return "Laptop [laptopId=" + laptopId + ", harddisk=" + harddisk + "]";
    }

}