package constructor.Level1;
import java.util.Scanner;
class Circle{
    double r;
    Circle(){
        r=1;
    }
    Circle(double r){
        this.r=r;
    }
    void show(){
        System.out.println("Radius:"+r);
    }
}
class CircleClass{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        double r=s.nextDouble();
        Circle se=new Circle();
        se.show();
        Circle se2=new Circle(r);
        se2.show();
    }
}