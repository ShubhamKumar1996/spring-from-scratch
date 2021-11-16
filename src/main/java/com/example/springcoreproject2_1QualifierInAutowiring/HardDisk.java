package com.example.springcoreproject2_1QualifierInAutowiring;

public class HardDisk {
    private int size;
    private int speed;
    public HardDisk() {
        super();
    }
    public HardDisk(int size, int speed) {
        super();
        this.size = size;
        this.speed = speed;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "HardDisk [size=" + size + ", speed=" + speed + "]";
    }

}