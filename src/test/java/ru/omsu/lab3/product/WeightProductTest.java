package ru.omsu.lab3.product;

import org.testng.annotations.Test;

public class WeightProductTest {
    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void testConstructorNullName() {
        WeightProduct product = new WeightProduct(null, "description string");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void testConstructorNullDescription() {
        WeightProduct product = new WeightProduct("Name", null);
    }
}
