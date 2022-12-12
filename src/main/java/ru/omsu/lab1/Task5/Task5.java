package ru.omsu.lab1.Task5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите нижний предел табулирования:");
        double a = sc.nextDouble();
        System.out.println("Введите верхний предел табулирования:");
        double b = sc.nextDouble();
        System.out.println("Введите шаг табулирования:");
        double h = sc.nextDouble();

        for (double i = a; i < b || (Math.abs(i-b)<1e-9); i += h) {
            double point = i;
            double y = Math.sin(point);
            DecimalFormat dF = new DecimalFormat("#.######");
            System.out.println("sin ("+dF.format(point)+") = "+dF.format(y));
            double sin = Math.sin(point);
        }
    }
}
