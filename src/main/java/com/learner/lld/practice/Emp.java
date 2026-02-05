package com.learner.lld.practice;

public class Emp {
    private String name;
    private String department;
    private double salary;

    public Emp(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " | " + department + " | " + salary;
    }
}


