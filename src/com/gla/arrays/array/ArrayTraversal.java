package com.gla.arrays;
import java.util.Scanner;
public class ArrayTraversal {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("ENTER YOUR NUMBERS:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("YOUR NUMBERS ARE:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
