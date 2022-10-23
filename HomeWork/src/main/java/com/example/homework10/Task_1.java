package com.example.homework10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task_1 {
    public static void main(String[] args) {
        Score score = new Score();
        score.arrayList.add(new Score.Product("Orange", 12345, 333));
        score.arrayList.add(new Score.Product("Apple", 14888, 334));
        score.arrayList.add(new Score.Product("Banana", 99798, 964));
        score.arrayList.add(new Score.Product("Meat", 15889, 178));
        System.out.println("Product List:");
        score.sortingProduct(1);

        System.out.println("Adding products:");
        score.addProduct("Mango", 11389, 555);
        score.addProduct("Lemon", 114599, 148);
        score.addProduct("Kiwi", 12345, 148);

        System.out.println("New product List:");
        score.sortingProduct(1);

        System.out.println("Remove product:");
        score.removeProduct(12345);

        System.out.println("Editing product:");
        score.editingProduct(14888, "Milk", 125);

        System.out.println("Adding sort:");
        score.sortingProduct(2);
    }
    public static class Score {
        ArrayList<Product> arrayList = new ArrayList<>();

        public void addProduct(String name, Integer id, Integer price) {
            for (int i = 0; i < arrayList.size(); i++) {
                Product product = arrayList.get(i);
                if (id == product.id) {
                } else {
                    arrayList.add(new Product(name, id, price));
                    break;
                }
            }
        }
        public void sortingProduct(Integer sortingMethod) {
            switch (sortingMethod) {
                case 1:
                    Collections.sort(arrayList, new Comparator<Product>() {
                        @Override
                        public int compare(Product product, Product t1) {
                            return Integer.valueOf(product.getPrice()).compareTo(
                                    Integer.valueOf(t1.getPrice())
                            );
                        }
                    });
                    for (int i = 0; i < arrayList.size(); i++) {
                        Product product = arrayList.get(i);
                        System.out.println("Product name: " + product.getName() + "; " + "Price: " + product.getPrice() + "; " + "Id: " + product.getId() + ";");
                    }
                    break;
                case 2:
                    for (int i = arrayList.size(); i <= 0; i--) {
                        Product product = arrayList.get(i);
                        System.out.println("Product name: " + product.getName() + "; " + "Price: " + product.getPrice() + "; " + "Id: " + product.getId() + ";");
                    }
                    break;
            }
        }
        public void removeProduct(int idRemove) {
            for (int i = 0; i < arrayList.size(); i++) {
                Product product = arrayList.get(i);
                if (idRemove == product.id) {
                    arrayList.remove(i);
                    System.out.println(product.name);
                    break;
                }
            }
        }
        public void editingProduct(int idEdit, String nameEdit, int priceEdit) {
            for (int i = 0; i < arrayList.size(); i++) {
                Product product = arrayList.get(i);
                if (idEdit == product.id) {
                    product.name = nameEdit;
                    product.price = priceEdit;
                    System.out.println(product.name);
                }
            }
        }
        static class Product {
            private String name;
            private Integer id;
            private Integer price;

            public Product(String name, Integer id, Integer price) {
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

            public Integer getPrice() {
                return price;
            }
        }
    }
}

