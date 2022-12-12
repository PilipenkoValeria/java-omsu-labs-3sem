package ru.omsu.lab1.Task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите коэффициенты первого уравнения:");
        double a11 = sc.nextDouble();
        double a12 = sc.nextDouble();
        double b1=sc.nextDouble();

        System.out.println("Введите коэффициенты второго уравнения:");
        double a21 = sc.nextDouble();
        double a22 = sc.nextDouble();
        double b2=sc.nextDouble();

        double x = 0;
        double y = 0;

        System.out.println("Первое уравнение: " + a11 + " * x + " + a12 + " * y = " + b1);
        System.out.println("Второе уравнение: " + a21 + " * x + " + a22 + " * y = " + b2);

        if (0 != ((a11 * a22) - (a12 * a21)))
        {
            x = ((b1 * a22) - (a12 * b2)) / ((a11 * a22) - (a12 * a21));
            y = ((a11 * b2) - (b1 * a21)) / ((a11 * a22) - (a12 * a21));
            System.out.println("Единственное решение: (" + x + ", " + y + ")");
        }
        else if (((((b2 * a11) - (b1 * a21)) == 0) && ((b1 * a22) - (b2 * a12) == 0)))
        {
            System.out.println("Бесконечное количество решений");
        }
        else
        {
            System.out.println("Нет решений");
        }
    }
}
