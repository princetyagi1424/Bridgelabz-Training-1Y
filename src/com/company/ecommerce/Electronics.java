package com.company.ecommerce;
public class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }
    public void getTaxDetails() {
        System.out.println("Electronics Tax: 18%");
    }
}