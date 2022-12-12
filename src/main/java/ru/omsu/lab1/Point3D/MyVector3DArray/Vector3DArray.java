package ru.omsu.lab1.Point3D.MyVector3DArray;

import com.MyPoint3D.Point3D;
import com.MyVector3D.Vector3D;
import com.MyVector3DProcessor.Vector3DProcessor;

public class Vector3DArray {
    public final Vector3D[] array;

    public void printVector3DArray() {
        for (int j = 0; j < array.length; j++) {
            System.out.println("arr[" + j + "] = [" + array[j] + "]");
        }
    }

    public Vector3DArray(int size) {
        array = new Vector3D[size];
        for (int i = 0; i < size; i++) {
            array[i] = new Vector3D();
        }
    }

    public int length() {
        return this.array.length;
    }

    public Vector3D getElement(int i) {
        return this.array[i];
    }

    public void changeElement(Vector3D vector, int index) {
        array[index] = vector;
    }

    public double maxVectorLength() {
        double res = -1;
        double tmp;

        for (Vector3D vector3D : array) {
            tmp = vector3D.getLength();
            if (tmp > res) res = tmp;
        }
        return res;
    }


    public int searchVector(Vector3D vector) {
        for (int i = 0; i < length(); i++) {
            if (array[i].equals(vector)) {
                return i;
            }
        }
        return -1;
    }

    public Vector3D sumArrayVectors() {
        Vector3D sum = new Vector3D();
        for (int i = 0; i < length(); i++) {
            sum = Vector3DProcessor.sum(sum, array[i]);
        }
        return sum;
    }

    public Vector3D lineCombination(double[] arrayCoefficients) {
        Vector3D resultVector = new Vector3D();
        if (arrayCoefficients.length == array.length) {
            for (int i = 0; i < arrayCoefficients.length; i++) {
                resultVector = new Vector3D(
                        resultVector.getX() + array[i].getX() * arrayCoefficients[i],
                        resultVector.getY() + array[i].getY() * arrayCoefficients[i],
                        resultVector.getZ() + array[i].getZ() * arrayCoefficients[i]);
            }
        }
        return resultVector;
    }

    public Point3D[] pointShiftArray(Point3D point) {
        if (point == null) {
            throw new IllegalArgumentException("NULL");
        }
        Point3D[] data = new Point3D[this.array.length];
        for (int i = 0; i < this.array.length; i++) {
            data[i] = new Point3D(
                    point.getX() + array[i].getX(),
                    point.getY() + array[i].getY(),
                    point.getZ() + array[i].getZ()
            );
        }
        return data;
    }
}
