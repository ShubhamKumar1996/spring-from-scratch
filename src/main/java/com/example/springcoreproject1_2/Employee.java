package com.example.springcoreproject1_2;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Employee {
    private int employeeId;
    private List<String> phones;
    private Set<String> address;
    private Map<String, String> courses;

    public Employee() {
    }
    public Employee(int employeeId, List<String> phones, Set<String> address, Map<String, String> courses) {
        this.employeeId = employeeId;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", phones=" + phones +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
}
