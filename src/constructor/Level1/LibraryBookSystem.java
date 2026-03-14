package constructor.Level1;
import java.util.Scanner;
class LibraryBook{
    String title;
    String author;
    double price;
    boolean available;
    LibraryBook(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
        available=true;
    }
    void borrow(){
        if(available){
            available=false;
            System.out.println("Borrowed");
        }else{
            System.out.println("Not Available");
        }
    }
    void show(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
        System.out.println("Available:"+available);
    }
}
class LibraryBookSystem{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String t=s.nextLine();
        String a=s.nextLine();
        double p=s.nextDouble();
        LibraryBook se=new LibraryBook(t,a,p);
        se.show();
        se.borrow();
        se.show();
    }
}