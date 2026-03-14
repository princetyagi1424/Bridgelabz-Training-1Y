package objectclasses.Level2;
import java.util.Scanner;
class CartItem{
    String itemName;
    double price;
    int quantity;
    CartItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    void add(int q){
        quantity=quantity+q;
    }
    void remove(int q){
        if(quantity>=q)quantity=quantity-q;
    }
    void show(){
        double am=price*quantity;
        System.out.println("Item:"+itemName);
        System.out.println("Price:"+price);
        System.out.println("Quantity:"+quantity);
        System.out.println("Total:"+am);
    }
}
class ShoppingCart{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        double p=s.nextDouble();
        int q=s.nextInt();
        int add=s.nextInt();
        int rem=s.nextInt();
        CartItem se=new CartItem(n,p,q);
        se.add(add);
        se.remove(rem);
        se.show();
    }
}