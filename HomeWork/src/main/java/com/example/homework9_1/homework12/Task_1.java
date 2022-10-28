package com.example.homework9_1.homework12;

public class Task_1 {
    public static void main(String[] args) {

        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        ThreadTwo threadTwo = new ThreadTwo();
        threadTwo.start();

    }
}

class ThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("First started");

    }
}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        try {
            sleep(5000);
            System.out.println("Second started");
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}
