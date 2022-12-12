package ru.omsu.lab1.Point3D.MyVector3DProcessor;
import com.MyVector3D.Vector3D;

import static com.MyVector3DProcessor.Vector3DProcessor.*;

public class Vector3DProcessor {
    private static int Vector3D;

    public static Vector3D sum(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ());
    }

    public static Vector3D dif(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ());
    }

    public static double scalar(Vector3D v1, Vector3D v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
    }

    public static Vector3D vec(Vector3D v1, Vector3D v2) {
        return new Vector3D(
                v1.getY()* v2.getZ()-v1.getZ()* v2.getY(),
                -(v1.getX()*v2.getZ())+ (v1.getZ()* v2.getX()),
                v1.getX()* v2.getY()- v1.getY()* v2.getX()

        );
    }
    public static boolean isCollinear(Vector3D v1, Vector3D v2) {
        Vector3D v=new Vector3D(0,0,0);
        return v.equals(vec(v1, v2));
    }
}

