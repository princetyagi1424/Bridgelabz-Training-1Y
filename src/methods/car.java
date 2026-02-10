package methods;
import java.sql.SQLOutput;
import java.util.Scanner;
public class car {
    static void nameofcompany(String company,String name,String model,double price) {
        System.out.println("YOUR NAME: "+name);
        System.out.println("YOUR COMPANY: "+company);
        System.out.println("YOUR MODEL: "+model);
        System.out.println("YOUR PRICE: "+price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        String name = sc.nextLine();
        System.out.println("ENTER YOUR COMPANY:");
        String company = sc.nextLine();
        System.out.println("ENTER YOUR PRICE:");
        Double price = sc.nextDouble();
        System.out.println("ENTER YOUR MODEL:");
        String model = sc.nextLine();
        nameofcompany(company,name,model,price);
    }
}
