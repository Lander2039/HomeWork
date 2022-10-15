package com.example.homework9;

import java.util.Arrays;

public class Task_7 {

    public static void main(String[] args) {
        int[] massive = {88, 39, 22, 44, 65, 1, 12, 54, 67, 20, 2, 9, 39};
        for (int i = 1; i < massive.length; i++) {
            int current = massive[i];
            int newValue = i - 1;
            while (newValue >= 0 && current < massive[newValue]) {
                massive[newValue + 1] = massive[newValue];
                newValue--;
            }
            massive[newValue + 1] = current;
        }
        System.out.println(Arrays.toString(massive));
    }
}
