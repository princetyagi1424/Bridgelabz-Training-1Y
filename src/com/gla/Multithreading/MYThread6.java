package com.gla.Multithreading;

public class MYThread6 implements Runnable {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Thread6: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MYThread5 myThread5 = new MYThread5();
        Thread t1 = new Thread(myThread5);
        t1.start();

        Thread t2 = new Thread(new MYThread6());
        t2.start();
    }
}