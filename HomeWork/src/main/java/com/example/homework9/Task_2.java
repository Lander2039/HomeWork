package com.example.homework9;

public class Task_2 {
    public static void main(String[] args) {
        int arraySize = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                arraySize++;
            }
        }
        int[] massive = new int[arraySize];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                massive[b] = i;
                b++;
            }
        }
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println("\n");
        for (int i = massive.length - 1; i >= 0; i--) {
            System.out.print(massive[i] + " ");
        }

    }
}
