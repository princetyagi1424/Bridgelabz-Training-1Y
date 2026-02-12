package com.gla.Extras1b;
import java.util.Scanner;

public class TemperatureConverter{
    static double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }
    static double celsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature value:");
        double value=sc.nextDouble();
        System.out.println("Enter unit (C/F):");
        char unit=sc.next().charAt(0);
        if(unit=='F'||unit=='f')
            System.out.println("Celsius: "+fahrenheitToCelsius(value));
        else if(unit=='C'||unit=='c')
            System.out.println("Fahrenheit: "+celsiusToFahrenheit(value));
    }
}
