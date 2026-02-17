package com.gla.Extras2;
import java.util.Scanner;

public class ReverseString{
    static String reverse(String s){
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("Reversed: "+reverse(s));
    }
}
