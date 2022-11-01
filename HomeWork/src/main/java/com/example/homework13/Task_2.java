package com.example.homework13;

public class Task_2 {
    public static void main(String[] args) {
        Score score = new Score();

        FurnitureFactory furnitureFactory = new FurnitureFactory(score, 100);
        Client client = new Client(score, 10000);

        new Thread(furnitureFactory).start();
        new Thread(client).start();

    }
}

class FurnitureFactory implements Runnable {
    Score score;
    int factoryAccount;

    public FurnitureFactory(Score score, int factoryAccount) {
        this.score = score;
        this.factoryAccount = factoryAccount;
    }

    public int getFurnitureFactory() {
        return factoryAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            score.put();
        }
    }
}

class Client implements Runnable {
    Score score;
    int clientAccount;

    public Client(Score score, int clientAccount) {
        this.score = score;
        this.clientAccount = clientAccount;
    }

    public int getClientAccount() {
        return clientAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            score.get();
        }
    }
}

class Score {
    int factoryAccount = 0;
    int clientAccount = 5000;
    int bed = 0;
    int priceBed = 1000;


    synchronized void get() {
        System.out.println("Factory Account: " + factoryAccount);
        System.out.println("Client Account: " + clientAccount);
        while (bed <= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.print("get interrupted");
            }
        }
        bed--;
        factoryAccount = factoryAccount + priceBed;
        clientAccount = clientAccount - priceBed;
        System.out.println("Client bought 1 bed.");
        System.out.println("Bed in stock: " + bed);
        notify();
    }

    synchronized void put() {
        while (bed >= 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.print("get interrupted");
            }
        }
        bed++;
        System.out.println("Furniture factory made 1 bed.");
        System.out.println("Bed in stock: " + bed);
        notify();
    }
}
