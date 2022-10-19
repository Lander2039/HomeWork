package com.example.homework9_1;

import java.util.Arrays;
import java.util.Random;

public class HomeWork9_1 {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
    }
    public static void task_1() {
        System.out.println("Task_1");
        int[][] massive = new int[3][3];
        for (int number2D = 0; number2D < massive.length; number2D++) {
            for (int number1D = 0; number1D < massive[number2D].length; number1D++) {
                Random random = new Random();
                int randomNumber = random.nextInt(10);
                massive[number2D][number1D] = randomNumber;
                System.out.print(massive[number2D][number1D] + "\t");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(massive));
    }

    public static void task_2() {
        System.out.println("Task_2");
        int[][][] massive3D = {{{10, 12, 31, 52}, {18, 6, 9}}, {{15, 42, 64, 31}}};

        for (int number3D = 0; number3D < massive3D.length; number3D++) {
            for (int number2D = 0; number2D < massive3D[number3D].length; number2D++) {
                for (int number1D = 0; number1D < massive3D[number3D][number2D].length; number1D++) {
                    System.out.print(massive3D[number3D][number2D][number1D] + "\t");
                }
                System.out.println();
            }
        }
        System.out.print(Arrays.deepToString(massive3D) + "\n");
    }

    public static void task_3() {
        System.out.println("Task_3");
        int[][] massive2D = new int[2][5];
        System.out.println("Original array: ");
        for (int number2D = 0; number2D < massive2D.length; number2D++) {
            for (int number1D = 0; number1D < massive2D[number2D].length; number1D++) {
                Random random = new Random();
                int randomNumber = random.nextInt(50);
                massive2D[number2D][number1D] = randomNumber;
                System.out.print(massive2D[number2D][number1D] + "\t");
            }
            System.out.println();
        }
        System.out.println("Modified array: ");
        Arrays.sort(massive2D[0]);
        int[] massive1d = massive2D[1];
        boolean isSorter = false;
        int buffer;
        while (!isSorter) {
            isSorter = true;
            for (int i = 0; i < massive1d.length - 1; i++) {
                if (massive1d[i] < massive1d[i + 1]) {
                    isSorter = false;
                    buffer = massive1d[i];
                    massive1d[i] = massive1d[i + 1];
                    massive1d[i + 1] = buffer;
                }
            }
        }
        massive2D[1] = massive1d;
        for (int number2D = 0; number2D < massive2D.length; number2D++) {
            for (int number1D = 0; number1D < massive2D[number2D].length; number1D++) {
                System.out.print(massive2D[number2D][number1D] + "\t");
            }
            System.out.println();
        }
    }

    public static void task_4() {
        System.out.println("Task_4");
        int[][][] massive3D = new int[3][3][3];
        for (int number3D = 0; number3D < massive3D.length; number3D++) {
            for (int number2D = 0; number2D < massive3D[number3D].length; number2D++) {
                for (int number1D = 0; number1D < massive3D[number3D][number2D].length; number1D++) {
                    Random random = new Random();
                    int randomNumber = random.nextInt(50);
                    massive3D[number3D][number2D][number1D] = randomNumber;
                    System.out.print(massive3D[number3D][number2D][number1D] + "\t");
                }
                System.out.println();
            }
        }
        System.out.print(Arrays.deepToString(massive3D) + "\n");
    }
}

