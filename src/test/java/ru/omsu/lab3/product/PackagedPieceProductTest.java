package ru.omsu.lab3.product;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PackagedPieceProductTest {
    PieceProduct product = new PieceProduct("Яблоки", "Зеленые яблоки", 160.00);
    PackagedPieceProduct packagedProduct = new PackagedPieceProduct(new ProductPackaging("Пакет",
            10.0), 10, product);


    @Test
    public void testGetCount() {
        assertEquals(packagedProduct.getCount(), 10);
    }

    @Test
    public void testGetProduct() {
        assertEquals(packagedProduct.getProduct(), product);
    }

    @Test
    public void testGetNetWeight() {
        assertEquals(packagedProduct.getNetWeight(), 1600.0);
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(packagedProduct.getGrossWeight(), 1610.0);
    }
}
