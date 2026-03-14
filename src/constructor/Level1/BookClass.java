package constructor.Level1;
import java.util.Scanner;
class Book{
    String title;
    String author;
    double price;
    Book(){
        title="None";
        author="None";
        price=0;
    }
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void show(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
    }
}
class BookClass{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String t=s.nextLine();
        String a=s.nextLine();
        double p=s.nextDouble();
        Book se=new Book();
        se.show();
        Book se2=new Book(t,a,p);
        se2.show();
    }
}