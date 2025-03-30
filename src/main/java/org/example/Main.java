package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(taskFive(1, 15));
        taskSix(8);
        System.out.println(taskSeven(8));
        taskEight("Задача 6", 2);
        System.out.println(taskNine(2025));
        taskTen();
        taskEleven();
        taskTwelve();
        taskThirteen(4);
        System.out.println(Arrays.toString(taskFourteen(3,4)));
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -8;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 200;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 8;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }

    static boolean taskFive(int a, int b) {
        return ((a + b >= 10) && (a + b <= 20));
    }

    static void taskSix(int a) {
        if (a < 0) System.out.println("Отрицательное число");
        else System.out.println("Положительное число");
    }

    static boolean taskSeven(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    static void taskEight(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    static boolean taskNine(int a) {
        if (((a % 4 == 0) && (a % 100 != 0)) || ((a % 4 == 0) && (a % 100 == 0) && (a % 400 == 0))) {
            return true;
        }
        return false;
    }
    static void taskTen() {
        // init array directly
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                array[i]++;
            else
                array[i]--;
        }
        System.out.println(Arrays.toString(array));
    }

    static void taskEleven() {
        int[] array = new int[100];
        for (int i = 0, j = 1; i < array.length; i++, j++){
            array[i] = j;
        }
        System.out.println(Arrays.toString(array));
    }

    static void taskTwelve() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++){
            if(array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void taskThirteen(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - i - 1] = 1;
        }

        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }

     static int[] taskFourteen (int len, int initialValue){
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }
}
