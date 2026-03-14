package com.company.employeesystem;
public class FullTimeEmployee extends Employee implements Department {
    private String department;
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    public double calculateSalary() {
        return getBaseSalary();
    }
    public void assignDepartment(String deptName) {
        department = deptName;
    }
    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}