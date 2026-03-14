package objectclasses.Level1;
import java.util.Scanner;
class Item{
    int itemCode;
    String itemName;
    double price;
    Item(int itemCode,String itemName,double price,int q){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
        System.out.println("Code:"+itemCode);
        System.out.println("Name:"+itemName);
        System.out.println("Price:"+price);
        double am=price*q;
        System.out.println("Total:"+am);
    }
}
class InventoryofItems{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        s.nextLine();
        String n=s.nextLine();
        double p=s.nextDouble();
        int q=s.nextInt();
        Item se=new Item(c,n,p,q);
    }
}