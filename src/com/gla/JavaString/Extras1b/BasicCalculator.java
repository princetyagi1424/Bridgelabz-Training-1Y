package com.gla.Extras1b;
import java.util.Scanner;

public class BasicCalculator{
    static double add(double a,double b){
        return a+b;
    }
    static double subtract(double a,double b){
        return a-b;
    }
    static double multiply(double a,double b){
        return a*b;
    }
    static double divide(double a,double b){
        return a/b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        double a=sc.nextDouble();
        System.out.println("Enter second number:");
        double b=sc.nextDouble();
        System.out.println("Choose operation (+,-,*,/):");
        char op=sc.next().charAt(0);
        if(op=='+')
            System.out.println("Result: "+add(a,b));
        else if(op=='-')
            System.out.println("Result: "+subtract(a,b));
        else if(op=='*')
            System.out.println("Result: "+multiply(a,b));
        else if(op=='/')
            System.out.println("Result: "+divide(a,b));
    }
}
