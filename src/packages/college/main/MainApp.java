package packages.college.main;

import packages.college.student.Student;
import packages.college.faculty.Faculty;
import packages.college.department.Department;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter faculty name: ");
        String facultyName = sc.nextLine();
        System.out.print("Enter department name: ");
        String departmentName = sc.nextLine();
        Student student = new Student(studentName);
        Faculty faculty = new Faculty(facultyName);
        Department department = new Department(departmentName);
        System.out.println("Student: " + student.getName());
        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Department: " + department.getName());
        sc.close();
    }
}