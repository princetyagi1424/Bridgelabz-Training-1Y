package objectclasses.Level1;
import java.util.Scanner;
class Circle{
    double r;
    Circle(double r){
        this.r=r;
        double am=3.14*r*r;
        double sc=2*3.14*r;
        System.out.println("Area:"+am);
        System.out.println("Circumference:"+sc);
    }
}
class AreaOfCircle{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        double r=s.nextDouble();
        Circle se=new Circle(r);
    }
}