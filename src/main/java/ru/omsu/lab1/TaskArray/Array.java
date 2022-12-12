package ru.omsu.lab1.TaskArray;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private static Scanner sc = new Scanner(System.in);

    public static void printArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.println("arr[" + j + "] = [" + array[j] + "]");
        }
    }

    public static void inputArray(int[] array) {
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public static int sumElem(int[] array) {
        int sum = 0;
        for (int value : array)
            sum += value;
        return sum;
    }

    public static int getCountOgEven(int[] array) {
        int even = 0;
        for (int value : array) {
            if (value % 2 == 0)
                even++;
        }
        return even;
    }

    public static int getCountOfRanged(int a, int b, int[] array) {
        int r = 0;
        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        for (int value : array) {
            if (value >= a && value <= b)
                r++;
        }
        return r;
    }

    public static boolean isPositiveArray(int[] array) {
        for (int value : array) {
            if (value < 0)
                return false;
        }
        return true;
    }

    public static void reverseArray(int[] array) {
        int tmp;
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        printArray(array);

        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array1 = new int[size];
        inputArray(array1);
        System.out.println("Массив: " + java.util.Arrays.toString(array1));

        sumElem(array1);
        System.out.println("Сумма элементов массива: " + sumElem(array1));

        getCountOgEven(array1);
        System.out.println("Количество чётных элементов в массиве: " + getCountOgEven(array1));

        System.out.println("Введите границы отрезка: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        getCountOfRanged(a, b, array1);
        System.out.println("Количество элементов массива, принадлежащих отрезку [" + a + ";" + b + "]: " + getCountOfRanged(a, b, array1));

        if (isPositiveArray(array1)) {
            System.out.println("Все элементы массива положительные");
        } else System.out.println("Не все элементы массива положительные");

        reverseArray(array1);
        System.out.println("Обратный массив: " + java.util.Arrays.toString(array1));
    }
}
