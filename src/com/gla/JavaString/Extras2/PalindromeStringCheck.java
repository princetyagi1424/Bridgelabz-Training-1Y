package com.gla.Extras2;
import java.util.Scanner;

public class PalindromeStringCheck{
    static boolean isPalindrome(String s){
        String str=s.toLowerCase();
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        if(isPalindrome(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
