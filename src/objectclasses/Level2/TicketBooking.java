package objectclasses.Level2;
import java.util.Scanner;
class MovieTicket{
    String movieName;
    int seatNumber;
    double price;
    MovieTicket(String movieName,int seatNumber,double price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;
    }
    void book(int s,double am){
        seatNumber=s;
        price=am;
    }
    void show(){
        System.out.println("Movie:"+movieName);
        System.out.println("Seat:"+seatNumber);
        System.out.println("Price:"+price);
    }
}
class TicketBooking{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String m=s.nextLine();
        int seNo=s.nextInt();
        double p=s.nextDouble();
        MovieTicket se=new MovieTicket(m,0,0);
        se.book(seNo,p);
        se.show();
    }
}