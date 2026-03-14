package com.company.ecommerce;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter Product Type (1-Electronics, 2-Clothing, 3-Groceries): ");
            int type = sc.nextInt();
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            if (type == 1) {
                products[i] = new Electronics(id, name, price);
            }
            else if (type == 2) {
                products[i] = new Clothing(id, name, price);
            }
            else {
                products[i] = new Groceries(id, name, price);
            }
        }
        System.out.println("\n----- Product Details -----");
        for (Product p : products) {
            p.displayProduct();
            double discount = p.calculateDiscount();
            double tax = 0;
            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                t.getTaxDetails();
            }
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------");
        }
        sc.close();
    }
}