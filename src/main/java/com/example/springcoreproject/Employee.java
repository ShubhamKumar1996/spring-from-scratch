package com.example.springcoreproject;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Employee {
    private int employeeId;
    private List<String> coworkers;
    private Set<String> familyMembers;
    private Map<String, String> childParent;

    public Employee() {
    }

    public Employee(int employeeId, List<String> coworkers, Set<String> familyMembers, Map<String, String> childParent) {
        this.employeeId = employeeId;
        this.coworkers = coworkers;
        this.familyMembers = familyMembers;
        this.childParent = childParent;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public List<String> getCoworkers() {
        return coworkers;
    }

    public void setCoworkers(List<String> coworkers) {
        this.coworkers = coworkers;
    }

    public Set<String> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Set<String> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public Map<String, String> getChildParent() {
        return childParent;
    }

    public void setChildParent(Map<String, String> childParent) {
        this.childParent = childParent;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", coworkers=" + coworkers +
                ", familyMembers=" + familyMembers +
                ", childParent=" + childParent +
                '}';
    }
}
