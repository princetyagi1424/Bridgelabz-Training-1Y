package objectclasses.Level2;
import java.util.Scanner;
class Student{
    String name;
    int rollNumber;
    int marks;
    Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
        String sc;
        if(marks>=90)sc="A";
        else if(marks>=75)sc="B";
        else if(marks>=50)sc="C";
        else sc="F";
        System.out.println("Name:"+name);
        System.out.println("Roll:"+rollNumber);
        System.out.println("Marks:"+marks);
        System.out.println("Grade:"+sc);
    }
}
class SimulateStudentReport {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        int r = s.nextInt();
        int m = s.nextInt();
        Student se = new Student(n, r, m);
    }
}