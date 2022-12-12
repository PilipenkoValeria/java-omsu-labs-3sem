package ru.omsu.lab1.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double a = sc.nextDouble();

        System.out.println("Введите второе число:");
        double b = sc.nextDouble();

        System.out.println("Введите третье число:");
        double c = sc.nextDouble();

        System.out.println("Числа в переменных a, b и c: " + a + " " + b + " " + c);

        double p = a * b * c;
        System.out.println("Произведение трех чисел:" +p);

        double s = (a + b + c) / 3.;
        System.out.println("Среднее арифметическое трех чисел:"+s);

        System.out.print("Возрастающая последовательность:");
        if (a<=b && a<=c && b<=c) System.out.println(" "+a+"  "+b+"  "+c);
        if (a<=b && a<=c && c<=b) System.out.println(" "+a+"  "+c+"  "+b);
        if (b<=a && b<=c && a<=c) System.out.println(" "+b+"  "+a+"  "+c);
        if (b<=a && b<=c && c<=a) System.out.println(" "+b+"  "+c+"  "+a);
        if (c<=a && c<=b && a<=b) System.out.println(" "+c+"  "+a+"  "+b);
        if (c<=a && c<=b && b<=a) System.out.println(" "+c+"  "+b+"  "+a);
    }
}
