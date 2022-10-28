package com.example.homework12;

public class Task_3 {
    public static void main(String[] args) {

        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread one!");
            }
        };

        Thread thread = new Thread(thread1);
        thread.start();
    }
}

