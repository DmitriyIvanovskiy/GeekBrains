/**
 * Java 1. HomeWork 3
 *
 * @author Dmitriy Ivanovskiy
 * @version 17.09.21
 */

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        binaryArray();
        arrayFrom1To100();
        moreThen6();
        diagonals();
        inputDate(4, 5);
    }

    // Задача 1. Бинарный массив, с заменой на противоположенные значения.
    public static void binaryArray() {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    // Задача 2. Массив длинной 100. Значения от 1 до 100
    public static void arrayFrom1To100() {
        int[] arr1to100 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr1to100[i] = i + 1;
            System.out.print (arr1to100[i] + " ");
        }
        System.out.println();
    }

    // Задача 3. Если значение массива <6 то *2
    public static void moreThen6() {
        int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] < 6) {
                arr6[i] *= 2;
            }
            System.out.println("arr6[" + i + "] = " + arr6[i]);
        }
    }

    // Задача 4. Диагонали двумерного массива
    public static void diagonals() {
        int[][] dublarr = new int[6][6];
        for (int i = 0; i < dublarr.length; i++) {
            for (int j = 0; j < dublarr.length; j++) {
                if (i == j) {
                    dublarr[i][j] = 1;
                    dublarr[i][dublarr.length - 1 - j] = 1;
                }
            }
        }
        for (int i = 0; i < dublarr.length; i++) {
            System.out.println(Arrays.toString(dublarr[i]));
        }
    }

    // Задача 5. Две переменных
    public static void inputDate(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
}


