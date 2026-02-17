package com.gla.Extras2;
import java.util.Scanner;

public class FindLongestWordInSentence{
    static String findLongest(String s){
        String[] words=s.split(" ");
        String longest="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longest.length())
                longest=words[i];
        }
        return longest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        System.out.println("Longest word: "+findLongest(s));
    }
}
