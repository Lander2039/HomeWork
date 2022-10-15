package com.example.homework9;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] massive = new int[15];
        int counter = 0;
        for (int i = 0; i < massive.length; i++) {
            int randomNumber = random.nextInt(50);
            massive[i] = randomNumber;
        }
        System.out.println(Arrays.toString(massive));

        for (int i = 0; i <= massive.length - 1; i++) {
            if (massive[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Number of odd numberscounter: " + counter);
    }
}
