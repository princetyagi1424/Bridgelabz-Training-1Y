package constructor.AccessModifiers;
import java.util.Scanner;
class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;
    void setCGPA(double c){
        CGPA=c;
    }
    double getCGPA(){
        return CGPA;
    }
}
class PostgraduateStudent extends Student{
    void show(){
        System.out.println("Roll:"+rollNumber);
        System.out.println("Name:"+name);
        System.out.println("CGPA:"+getCGPA());
    }
}
class UniversityManagementSystem{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        s.nextLine();
        String n=s.nextLine();
        double c=s.nextDouble();
        PostgraduateStudent se=new PostgraduateStudent();
        se.rollNumber=r;
        se.name=n;
        se.setCGPA(c);
        se.show();
    }
}