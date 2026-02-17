package com.gla.Extras2;
import java.util.Scanner;

public class FindSubstringOccurrences{
    static int countOccurrences(String str,String sub){
        int count=0,index=0;
        while((index=str.indexOf(sub,index))!=-1){
            count++;
            index+=sub.length();
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter main string:");
        String str=sc.nextLine();
        System.out.println("Enter substring:");
        String sub=sc.nextLine();
        System.out.println("Occurrences: "+countOccurrences(str,sub));
    }
}
