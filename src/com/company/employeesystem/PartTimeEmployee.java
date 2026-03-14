package com.company.employeesystem;
public class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String department;
    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        this.hoursWorked = hours;
    }
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }
    public void assignDepartment(String deptName) {
        department = deptName;
    }
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}