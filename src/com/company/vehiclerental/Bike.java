package com.company.vehiclerental;
public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Bike(String number, double rate, String policy) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policy;
    }
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + insurancePolicyNumber);
    }
}