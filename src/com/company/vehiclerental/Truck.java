package com.company.vehiclerental;
public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Truck(String number, double rate, String policy) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policy;
    }
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy: " + insurancePolicyNumber);
    }
}