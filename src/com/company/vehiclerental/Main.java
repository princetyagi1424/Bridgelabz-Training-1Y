package com.company.vehiclerental;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nSelect Vehicle Type (1-Car 2-Bike 3-Truck): ");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Vehicle Number: ");
            String number = sc.nextLine();
            System.out.print("Enter Rental Rate per day: ");
            double rate = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Insurance Policy Number: ");
            String policy = sc.nextLine();
            if (choice == 1) {
                vehicles[i] = new Car(number, rate, policy);
            } else if (choice == 2) {
                vehicles[i] = new Bike(number, rate, policy);
            } else {
                vehicles[i] = new Truck(number, rate, policy);
            }
        }
        System.out.print("\nEnter number of rental days: ");
        int days = sc.nextInt();
        System.out.println("\n------ Vehicle Rental Details ------");
        for (Vehicle v : vehicles) {
            v.displayVehicle();
            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;
            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insuranceCost = ins.calculateInsurance();
                ins.getInsuranceDetails();
            }
            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("--------------------------");
        }
        sc.close();
    }
}