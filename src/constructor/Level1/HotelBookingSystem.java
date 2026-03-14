package constructor.Level1;
import java.util.Scanner;
class HotelBooking{
    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        guestName="None";
        roomType="None";
        nights=0;
    }
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    HotelBooking(HotelBooking h){
        guestName=h.guestName;
        roomType=h.roomType;
        nights=h.nights;
    }
    void show(){
        System.out.println("Name:"+guestName);
        System.out.println("Room:"+roomType);
        System.out.println("Nights:"+nights);
    }
}
class HotelBookingSystem{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        String r=s.nextLine();
        int ni=s.nextInt();
        HotelBooking se=new HotelBooking();
        se.show();
        HotelBooking se2=new HotelBooking(n,r,ni);
        se2.show();
        HotelBooking se3=new HotelBooking(se2);
        se3.show();
    }
}