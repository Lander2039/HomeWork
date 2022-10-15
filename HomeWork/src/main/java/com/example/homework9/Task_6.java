package com.example.homework9;

import java.util.Arrays;

public class Task_6 {

    public static void main(String[] args) {
        int[] massive = {21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};
        boolean isSorter = false;
        int buffer;

        while (!isSorter) {
            isSorter = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    isSorter = false;

                    buffer = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
