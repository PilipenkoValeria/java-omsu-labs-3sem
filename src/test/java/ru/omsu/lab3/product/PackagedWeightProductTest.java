package ru.omsu.lab3.product;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PackagedWeightProductTest {
    PackagedWeightProduct product = new PackagedWeightProduct(new ProductPackaging("Пакет", 90.0),
            999.99, new WeightProduct("Цемент", "Белый цемент"));

    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void testConstructorNegativeWeight() {
        PackagedWeightProduct product = new PackagedWeightProduct(new ProductPackaging("Пакет", 90.0),
                -999.99, new WeightProduct("Цемент", "Белый цемент"));
    }

    @Test
    public void testGetNetWeight() {
        assertEquals(product.getNetWeight(), 999.99);
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(product.getGrossWeight(), 1089.99);
    }
}