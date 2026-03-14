package constructor.Level1;
import java.util.Scanner;
class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
    double price;
    CarRental(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
        price=rentalDays*1000;
    }
    void show(){
        System.out.println("Name:"+customerName);
        System.out.println("Car:"+carModel);
        System.out.println("Days:"+rentalDays);
        System.out.println("Total:"+price);
    }
}
class CarRentalSystem{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        String m=s.nextLine();
        int d=s.nextInt();
        CarRental se=new CarRental(n,m,d);
        se.show();
    }
}