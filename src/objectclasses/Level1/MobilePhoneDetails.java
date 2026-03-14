package objectclasses.Level1;
import java.util.Scanner;
class MobilePhone{
    String brand;
    String model;
    double price;
    MobilePhone(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
    }
}
class MobilePhoneDetails{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String b=s.nextLine();
        String m=s.nextLine();
        double p=s.nextDouble();
        MobilePhone se=new MobilePhone(b,m,p);
    }
}