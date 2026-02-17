package com.gla.Extras2;
import java.util.Scanner;

public class RemoveSpecificCharacter{
    static String removeChar(String s,char ch){
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch)
                result+=s.charAt(i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        System.out.println("Enter character to remove:");
        char ch=sc.next().charAt(0);
        System.out.println("Modified String: \""+removeChar(s,ch)+"\"");
    }
}
