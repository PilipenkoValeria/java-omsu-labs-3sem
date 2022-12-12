package ru.omsu.lab1.Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = sc.nextDouble();
        System.out.println("Введите точность вычисления:");
        double eps = sc.nextDouble();
        double sum = 1, i = 2, fact = x;
        while (Math.abs(fact) >= eps) {
            sum += fact;
            fact *= x / i;
            i++;
        }
        System.out.println("Значение е^" + x + " = " + sum);
        double ex = Math.exp(x);
        System.out.println("Проверка: " + Math.exp(x));
    }
}
