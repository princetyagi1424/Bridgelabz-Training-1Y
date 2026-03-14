package com.company.ecommerce;
public class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }
    public double calculateTax() {
        return getPrice() * 0.12; // 12% tax
    }
    public void getTaxDetails() {
        System.out.println("Clothing Tax: 12%");
    }
}