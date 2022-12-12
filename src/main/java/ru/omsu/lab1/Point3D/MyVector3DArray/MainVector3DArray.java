package ru.omsu.lab1.Point3D.MyVector3DArray;

import com.MyVector3DArray.Vector3DArray;
import com.MyPoint3D.Point3D;
import com.MyVector3D.Vector3D;


import java.util.Arrays;

public class MainVector3DArray {
    public static void main(String[] args) {
        Vector3DArray vecArr = new Vector3DArray(5);
        System.out.println("Массив из " + vecArr.length() + " нулевых векторов." + "\n");
        vecArr.printVector3DArray();
        System.out.println();

        Vector3D v = new Vector3D(3, 2, 3);
        vecArr.changeElement(v, 0);
        System.out.println("Заменили элемент arr[0] на вектор: " + vecArr.getElement(0));
        Vector3D v3 = new Vector3D(4, 5, 6);
        vecArr.changeElement(v3, 3);
        System.out.println("Заменили элемент arr[3] на вектор: " + vecArr.getElement(3) + "\n");

        vecArr.printVector3DArray();
        System.out.println();

        System.out.println("Наибольшая длина вектора в массиве: " + vecArr.maxVectorLength() + "\n");
        Vector3D v0 = new Vector3D(1, 1, 1);
        if (vecArr.searchVector(v0) == 1) {
            System.out.println("Вектор с координатами " + v0 + " найден.\n");
        } else {
            System.out.println("Вектор с координатами " + v0 + " не найден.\n");
        }

        System.out.println("Сумма всех векторов в массиве: " + vecArr.sumArrayVectors() + "\n");

        double[] coef = {1, 2, 0, 0, 1};
        System.out.println("Линейная комбинация векторов с коэффициентами " + Arrays.toString(coef) + ":\n"
                + vecArr.lineCombination(coef) + "\n");

        Point3D point = new Point3D(2, 2, 2);

        System.out.println("Массив точек, кождая из который результат сдвига " + point +
                "\nна соответствующий вектор: " + Arrays.toString(vecArr.pointShiftArray(point)));
    }
}
