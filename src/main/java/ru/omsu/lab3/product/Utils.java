package ru.omsu.lab3.product;

import java.util.Arrays;

public class Utils {
    public static double getProductWeight(PackagedProduct... products) {
        return Arrays.stream(products).mapToDouble(PackagedProduct::getGrossWeight).sum();
    }
}
