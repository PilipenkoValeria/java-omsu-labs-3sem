package ru.omsu.lab3.product;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PackagedProductSetTest {
    ProductPackaging productPackaging = new ProductPackaging("коробка", 10.0);
    PieceProduct apple = new PieceProduct("Яблоки", "Зеленые яблоки", 100.0);
    PackagedPieceProduct appleBox = new PackagedPieceProduct(productPackaging, 10, apple);
    PackagedPieceProduct[] products = {appleBox, appleBox};
    PackagedProductSet set = new PackagedProductSet("Фрукты", "Разные фрукты", productPackaging, products);

    @Test
    public void testGetProducts() {
        assertEquals(set.getProducts(), products);
    }

    @Test
    public void testGetNetWeight() {
        assertEquals(set.getNetWeight(), 2020.0);
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(set.getGrossWeight(), 2030.0);
    }
}