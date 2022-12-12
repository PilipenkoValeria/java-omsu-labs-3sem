package ru.omsu.lab1.Point3D.MyVector3D;

import com.MyVector3D.Vector3D;

import java.util.Scanner;

public class MainVector3D {
    public static void main(String[] args) {
        Vector3D vector = new Vector3D();
        System.out.println("Нулевой вектор: " + vector);

        Scanner in = new Scanner(System.in);

        System.out.println("Введите координаты первого вектора:");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Vector3D v1 = new Vector3D(x, y, z);

        System.out.println("Введите координаты второго вектора:");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();
        Vector3D v2 = new Vector3D(x1, y1, z1);

        System.out.println("Длина первого вектора: " + v1.getLength() +
                "\nДлина второго вектора: " + v2.getLength() + "\n");
        if (v1.equals(v2)) {
            System.out.println("Векторы равны!");
        } else {
            System.out.println("Векторы не равны!");
        }


    }
}
