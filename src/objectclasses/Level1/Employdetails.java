package objectclasses.Level1;

import java.util.Scanner;
class Employee{
    String name;
    int id;
    double salary;
    Employee(String n,int i,double s){
        name=n;
        id=i;
        salary=s;
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Salary:"+salary);
    }
}
public class Employdetails{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int id=sc.nextInt();
        double salary=sc.nextDouble();
        Employee se=new Employee(name,id,salary);
    }
}