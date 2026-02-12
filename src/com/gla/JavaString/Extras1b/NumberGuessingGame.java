package com.gla.Extras1b;
import java.util.Scanner;

public class NumberGuessingGame{
    static int generateGuess(int low,int high){
        return low+(int)(Math.random()*(high-low+1));
    }
    static String getFeedback(Scanner sc){
        return sc.nextLine().toLowerCase();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int low=1,high=100;
        System.out.println("Think of a number between 1 and 100");
        while(true){
            int guess=generateGuess(low,high);
            System.out.println("Is it "+guess+"? (high/low/correct)");
            String feedback=getFeedback(sc);
            if(feedback.equals("correct")){
                System.out.println("Guessed correctly!");
                break;
            }
            else if(feedback.equals("high")){
                high=guess-1;
            }
            else if(feedback.equals("low")){
                low=guess+1;
            }
        }
    }
}
