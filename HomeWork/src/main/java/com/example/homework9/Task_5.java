package com.example.homework9;

import java.util.Arrays;
import java.util.Random;

public class Task_5 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] massive = new int[12];
        int maxNumber = 0;
        int index = 0;
        for (int i = 0; i <= massive.length - 1; i++) {
            int randomNumber = random.nextInt(15);
            massive[i] = randomNumber;
        }
        System.out.println(Arrays.toString(massive));

        for (int i = 0, a = i + 1; i <= massive.length - 1; i++) {
            if (massive[i] > massive[a]) {
                if (maxNumber < massive[i]) {
                    maxNumber = massive[i];
                    index = i;
                }
            } else {
                if (maxNumber < massive[a]) {
                    maxNumber = massive[a];
                    index = a;
                }
            }
        }
        System.out.println("Max number in array: " + maxNumber);
        System.out.println("Index of occurrence in the array of the maximum number: " + index);
    }
}
