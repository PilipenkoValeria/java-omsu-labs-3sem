package ru.omsu.lab1.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите коэффициент a:");
        double a = sc.nextDouble();

        System.out.println("Введите коэффициент b:");
        double b = sc.nextDouble();

        System.out.println("Введите коэффициент c:");
        double c = sc.nextDouble();

        double d = b*b-4*a*c;

        if(d<0){
            System.out.println("Корней нет");
        }else if(d==0){
            double x=-b/(2*a);
            System.out.println("Корень один: "+x);
        }else{
            double x1=(-b+Math.sqrt(d))/(2*a);
            System.out.println("Первый корень: "+x1);
            double x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Второй корень: "+x2);
        }
    }
}
