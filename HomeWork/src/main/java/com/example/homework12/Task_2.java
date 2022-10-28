package com.example.homework12;

public class Task_2 {

    public static void main(String[] args) {

        ThreadTree threadTree = new ThreadTree();
        threadTree.start();

        ThreadFour threadFour = new ThreadFour();
        Thread thread2 = new Thread(threadFour);
        threadFour.run();

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                System.out.println("Third started!");
            }
        };
        thread3.start();

        Runnable thread4 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Fourth started!");
            }
        };
        Thread thread = new Thread(thread4);
        thread.start();
    }
}

class ThreadTree extends Thread {
    @Override
    public void run() {
        System.out.println("First started!");
    }
}

class ThreadFour implements Runnable {
    @Override
    public void run() {
        System.out.println("Second started!");
    }
}
