package constructor.AccessModifiers;
import java.util.Scanner;
class Employee{
    public int employeeID;
    protected String department;
    private double salary;
    void setSalary(double s){
        salary=s;
    }
    double getSalary(){
        return salary;
    }
}
class Manager extends Employee{
    void show(){
        System.out.println("ID:"+employeeID);
        System.out.println("Department:"+department);
        System.out.println("Salary:"+getSalary());
    }
}
class EmployeeRecords{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        s.nextLine();
        String d=s.nextLine();
        double sa=s.nextDouble();
        Manager se=new Manager();
        se.employeeID=i;
        se.department=d;
        se.setSalary(sa);
        se.show();
    }
}