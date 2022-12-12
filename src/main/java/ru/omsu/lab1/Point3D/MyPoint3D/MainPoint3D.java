package ru.omsu.lab1.Point3D.MyPoint3D;

import com.MyPoint3D.Point3D;
import java.util.Scanner;
import static com.MyPoint3D.Point3D.distance;

public class MainPoint3D {
    public static void main(String[] args) {
        Point3D point = new Point3D();
        System.out.println("Точка - начало координат: " + point);

        Scanner in = new Scanner(System.in);
        System.out.print("Введите координаты первой точки: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Point3D p1 = new Point3D(x, y, z);

        System.out.println("Введите координаты второй точки:");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double z1 = in.nextDouble();
        Point3D p2 = new Point3D(x1, y1, z1);

        if(p1.equals(p2))
            System.out.println("Точки равныю");
        else
            System.out.println("Точки не равны.");

        System.out.println("Расстояние между точками " + p1 + " и " + p2 + " = " + distance(p1, p2));

    }
}
