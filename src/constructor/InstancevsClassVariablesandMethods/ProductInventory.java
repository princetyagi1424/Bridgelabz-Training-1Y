package constructor.InstancevsClassVariablesandMethods;
import java.util.Scanner;
class Product{
    String productName;
    double price;
    static int totalProducts=0;
    Product(String productName,double price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    void displayProductDetails(){
        System.out.println("Name:"+productName);
        System.out.println("Price:"+price);
    }
    static void displayTotalProducts(){
        System.out.println("Total:"+totalProducts);
    }
}
class ProductInventory{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        double p=s.nextDouble();
        Product se=new Product(n,p);
        se.displayProductDetails();
        Product.displayTotalProducts();
    }
}