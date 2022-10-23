package com.example.homework10;

import static com.example.homework10.Shop.addProduct;
import static com.example.homework10.Shop.arrayList;
import static com.example.homework10.Shop.deleteProduct;
import static com.example.homework10.Shop.productEditing;
import static com.example.homework10.Shop.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) throws WrongActionException, InvalidSymbolException {
        Shop shop = new Shop();
        arrayList.add(new Shop.Product("Orange", 12345, 3330));
        arrayList.add(new Shop.Product("Apple", 14888, 334));
        arrayList.add(new Shop.Product("Banana", 99798, 964));
        try {
            shop.console();
        } catch (WrongActionException e) {
            System.out.println(e.getMessage());
            shop.console();
        }
        try {
            sorting();
        } catch (WrongActionException e) {
            System.out.println(e.getMessage());
            sorting();
        }
        try {
            addProduct();
        } catch (WrongActionException e) {
            System.out.println(e.getMessage());
            addProduct();
        }
        try {
            deleteProduct();
        } catch (WrongActionException e) {
            System.out.println(e.getMessage());
            deleteProduct();
        }
        try {
            productEditing();
        } catch (WrongActionException e) {
            System.out.println(e.getMessage());
            productEditing();
        }
    }
}

class Shop {
    static ArrayList<Product> arrayList = new ArrayList<>();

    public void console() throws WrongActionException, InvalidSymbolException {
        System.out.println("Please select the desired action:" + "\n" + "1. Display all products." + "\n" + "2. Adding a product." + "\n" + "3. Deleting a product" + "\n" + "4. Product Editing." + "\n" + "5. Exit.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a <= 5) {
            switch (a) {
                case 1:
                    sorting();
                    return;
                case 2:
                    addProduct();
                case 3:
                    deleteProduct();
                case 4:
                    productEditing();
                case 5:
                    System.out.println("Goodbye");
                    break;
            }
        } else {
            throw new WrongActionException("Please select a value from 1 to 5!!!");
        }
    }

    static class Product {
        private String name;
        private Integer id;
        private int price;

        public Product(String name, Integer id, int price) {
            this.name = name;
            this.id = id;
            this.price = price;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void sorting() throws WrongActionException, InvalidSymbolException {
        Shop shop = new Shop();
        System.out.println("What sort would you like the list to be in?" + "\n" + "1. By price(increase)" + "\n" + "2. By price(desc)" + "\n" + "3. By addition (new ones first, then older ones)");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a <= 3) {
            switch (a) {
                case 1:
                    Collections.sort(arrayList, new Comparator<Product>() {
                        @Override
                        public int compare(Product product, Product t1) {
                            return Integer.valueOf(product.getPrice()).compareTo(
                                    Integer.valueOf(t1.getPrice())
                            );
                        }
                    });
                    System.out.println();
                    for (int i = 0; i < arrayList.size(); i++) {
                        Product product = arrayList.get(i);
                        System.out.println("Product name: " + product.getName() + "; " + "Price: " + product.getPrice() + "; " + "Id: " + product.getId() + ";");
                    }
                case 2:
                    Collections.sort(arrayList, new Comparator<Product>() {
                        @Override
                        public int compare(Product product, Product t1) {
                            return Integer.valueOf(product.getPrice()).compareTo(
                                    Integer.valueOf(t1.getPrice())
                            );
                        }
                    });
                    System.out.println();
                    for (int i = arrayList.size(); i <= 0; i--) {
                        Product product = arrayList.get(i);
                        System.out.println("Product name: " + product.getName() + "; " + "Price: " + product.getPrice() + "; " + "Id: " + product.getId() + ";");
                    }
                case 3:
                    for (int i = 0; i < arrayList.size(); i++) {
                        Product product = arrayList.get(i);
                        System.out.println("Product name: " + product.getName() + "; " + "Price: " + product.getPrice() + "; " + "Id: " + product.getId() + ";");
                    }
            }
        } else {
            throw new WrongActionException("Please select a value from 1 to 3!!!");
        }
        shop.console();
    }

    public static void addProduct() throws WrongActionException, InvalidSymbolException {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product id: ");
        int id = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            Product product = arrayList.get(i);
            if (id == product.id) {
                System.out.println("Error. \n" + "Enter a different product id.");
                id = scanner.nextInt();
            }
        }
        String name2 = scanner.nextLine();
        System.out.println("Enter the product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the product price: ");
        int price = scanner.nextInt();
        arrayList.add(new Product(name, id, price));
        System.out.println("Product added successfully");
        System.out.println("Select action:" + "\n" + "1.Add another product" + "\n" + "2. Exit to the main menu");
        int a = scanner.nextInt();
        if (a <= 2) {
            switch (a) {
                case 1:
                    addProduct();
                case 2:
                    shop.console();
            }
        } else {
            throw new WrongActionException("Please select a value from 1 to 2!!!");
        }
    }

    public static void deleteProduct() throws WrongActionException, InvalidSymbolException {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product id: ");
        int id = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            Product product = arrayList.get(i);
            if (id == product.id) {
                arrayList.remove(i);
                System.out.println("Delete!");
            }
        }
        System.out.println("Select action:" + "\n" + "1.Delete another product" + "\n" + "2. Exit to the main menu");
        int a = scanner.nextInt();
        if (a <= 2) {
            switch (a) {
                case 1:
                    deleteProduct();
                case 2:
                    shop.console();
            }
        } else {
            throw new WrongActionException("Please select a value from 1 to 2!!!");
        }
    }

    public static void productEditing() throws WrongActionException, InvalidSymbolException {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product id: ");
        int newId = scanner.nextInt();
        String newName2 = scanner.nextLine();
        System.out.println("Enter the new product name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter the new product price: ");
        int newPrice = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            Product product = arrayList.get(i);
            if (newId == product.id) {
                product.name = newName;
                product.price = newPrice;
                System.out.println("Edited");
            } else {
                System.out.println("Error");
            }
        }
        System.out.println("Select action:" + "\n" + "1.Editing another product" + "\n" + "2. Exit to the main menu");
        int a = scanner.nextInt();
        if (a <= 2) {
            switch (a) {
                case 1:
                    productEditing();
                case 2:
                    shop.console();
            }
        } else {
            throw new WrongActionException("Please select a value from 1 to 2!!!");
        }
    }
}

class WrongActionException extends Exception {
    private final String message;

    public WrongActionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

class InvalidSymbolException extends Exception {
    private final String message2;

    public InvalidSymbolException(String message2) {
        this.message2 = message2;
    }

    public String getMessage2() {
        return message2;
    }
}



