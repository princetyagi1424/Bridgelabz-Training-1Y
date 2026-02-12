package com.gla.Extras1b;
import java.util.Scanner;

public class GCDAndLCMCalculator{
    static int takeInput(Scanner sc){
        return sc.nextInt();
    }
    static int findGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    static int findLCM(int a,int b){
        return (a*b)/findGCD(a,b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=takeInput(sc);
        int b=takeInput(sc);
        int gcd=findGCD(a,b);
        int lcm=findLCM(a,b);
        System.out.println("GCD: "+gcd);
        System.out.println("LCM: "+lcm);
    }
}
