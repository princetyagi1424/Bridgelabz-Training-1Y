package com.gla.Extras1b;
import java.util.Scanner;

public class PalindromeChecker{
    static String takeInput(Scanner sc){
        return sc.nextLine();
    }
    static boolean isPalindrome(String s){
        String str=s.replaceAll("\\s+","").toLowerCase();
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    static void displayResult(boolean result){
        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String input=takeInput(sc);
        boolean result=isPalindrome(input);
        displayResult(result);
    }
}
