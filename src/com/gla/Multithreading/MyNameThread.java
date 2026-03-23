
package com.gla.Multithreading;
import java.util.Scanner;

public class MyNameThread implements Runnable{

    public void run() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME: ");
        String name=sc.nextLine();

        int []a=new int[name.length()];

        for(int i=0;i<name.length();i++){
            a[i]=name.charAt(i);
        }

        for(int i=0;i<name.length();i++){
            System.out.println(a[i]);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        MYThread5 myThread5 =new MYThread5();
        Thread t = new Thread(myThread5);
        t.start();
    }
}
