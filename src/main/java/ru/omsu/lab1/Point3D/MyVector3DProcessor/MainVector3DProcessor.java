package ru.omsu.lab1.Point3D.MyVector3DProcessor;

import com.MyVector3D.Vector3D;

import java.util.Scanner;

import static com.MyVector3DProcessor.Vector3DProcessor.*;

public class MainVector3DProcessor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите координаты первого вектора:");
        double x= in.nextDouble();
        double y= in.nextDouble();
        double z= in.nextDouble();
        Vector3D v1=new Vector3D(x,y,z);

        System.out.println("Введите координаты второго вектора:");
        double x1= in.nextDouble();
        double y1= in.nextDouble();
        double z1= in.nextDouble();
        Vector3D v2=new Vector3D(x1,y1,z1);

        System.out.println("Сумма двух векторов: " + sum(v1, v2));
        System.out.println("Разность двух векторов: " + dif(v1, v2));
        System.out.println("Скалярное произведение: " + scalar(v1, v2));
        System.out.println("Векторное произведение: " + vec(v1, v2));

        if(isCollinear(v1, v2)){
            System.out.println("Векторы коллинеарны");
        } else {
            System.out.println("Вектора не коллинеарны");
        }
    }
}
