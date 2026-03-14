package com.company.employeesystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Full Time Employee Details");
        System.out.print("Enter ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Fixed Salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine();

        Employee e1 = new FullTimeEmployee(id1, name1, salary1);
        System.out.print("Enter Department: ");
        String dept1 = sc.nextLine();
        Department d1 = (Department) e1;
        d1.assignDepartment(dept1);
        System.out.println("\nEnter Part Time Employee Details");
        System.out.print("Enter ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Hourly Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Hours Worked: ");
        int hours = sc.nextInt();
        sc.nextLine();

        Employee e2 = new PartTimeEmployee(id2, name2, rate, hours);
        System.out.print("Enter Department: ");
        String dept2 = sc.nextLine();

        Department d2 = (Department) e2;
        d2.assignDepartment(dept2);
        Employee[] employees = {e1, e2};
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());
            Department dept = (Department) emp;
            dept.getDepartmentDetails();
            System.out.println("---------------------");
        }

        sc.close();
    }
}