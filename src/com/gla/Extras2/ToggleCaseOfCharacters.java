package com.gla.Extras2;
import java.util.Scanner;

public class ToggleCaseOfCharacters{
    static String toggleCase(String s){
        String result="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
                result+=Character.toLowerCase(ch);
            else if(Character.isLowerCase(ch))
                result+=Character.toUpperCase(ch);
            else
                result+=ch;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("Result: "+toggleCase(s));
    }
}
