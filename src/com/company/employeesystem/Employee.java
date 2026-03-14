package com.company.employeesystem;
public abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    public Employee(int id, String name, double salary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = salary;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}