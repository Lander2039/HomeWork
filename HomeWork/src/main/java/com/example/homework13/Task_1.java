package com.example.homework13;

public class Task_1 {
    public static void main(String[] args) {
        Shop shop = new Shop();

        CarFactory carFactory = new CarFactory(shop);
        Customer customer = new Customer(shop);

        new Thread(carFactory).start();
        new Thread(customer).start();
    }
}

class CarFactory implements Runnable {
    Shop shop;

    public CarFactory(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
            shop.put();
        }
    }
}

class Customer implements Runnable {
    Shop shop;

    Customer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            shop.get();
        }
    }
}

class Shop {
    int car = 0;

    synchronized void get() {
        while (car < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.print("get interrupted");
            }
        }
        car--;
        System.out.println("Consumer bought 1 car.");
        System.out.println("Vehicles in stock: " + car);
        notify();
    }

    synchronized void put() {
        while (car >= 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.print("get interrupted");
            }
        }
        car++;
        System.out.println("Car factory made 1 car.");
        System.out.println("Vehicles in stock: " + car);
        notify();
    }
}

