package com.gla.Multithreading;

public class MYThread5 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread5: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void main(String[] args) {
        MYThread5 myThread5 = new MYThread5();
        Thread t = new Thread(myThread5);
        t.start();
    }
}
