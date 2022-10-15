package com.example.homework9;

import java.util.Arrays;
import java.util.Random;

public class Task_4 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] massive = new int[20];
        int[] massiveModified;
        for (int i = 0; i <= massive.length - 1; i++) {
            int randomNumber = random.nextInt(20);
            massive[i] = randomNumber;
        }
        System.out.println("Original array: " + Arrays.toString(massive));
        massiveModified = massive;
        for (int i = 0; i <= massiveModified.length - 1; i++) {
            if (massiveModified[i] % 2 != 0) {
                massiveModified[i] = 0;
            }
        }
        System.out.println("Modified Array: " + Arrays.toString(massiveModified));
    }
}
