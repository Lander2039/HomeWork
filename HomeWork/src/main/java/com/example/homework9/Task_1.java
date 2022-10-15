package com.example.homework9;

public class Task_1 {
    public static void main(String[] args) {
        int arraySize = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                arraySize++;
                System.out.println(arraySize);
            }
        }
        int[] massive = new int[arraySize];

        for (int i = 2, a = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                massive[a] = i;
                a++;
            }
        }
        for (int i : massive) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i : massive) {
            System.out.println(i + "\n");
        }
    }
}