package com.gla.Extras2;
import java.util.Scanner;

public class CompareTwoStrings{
    static int compare(String s1,String s2){
        int len1=s1.length(),len2=s2.length();
        int min=len1<len2?len1:len2;
        for(int i=0;i<min;i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return s1.charAt(i)-s2.charAt(i);
        }
        return len1-len2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1=sc.nextLine();
        System.out.println("Enter second string:");
        String s2=sc.nextLine();
        int result=compare(s1,s2);
        if(result<0)
            System.out.println("\""+s1+"\" comes before \""+s2+"\" in lexicographical order");
        else if(result>0)
            System.out.println("\""+s1+"\" comes after \""+s2+"\" in lexicographical order");
        else
            System.out.println("Both strings are equal");
    }
}
