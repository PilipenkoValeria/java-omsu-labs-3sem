package ru.omsu.lab3.product;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ProductBatchTest {
    ProductPackaging productPackaging = new ProductPackaging("Коробка", 5.0);
    PackagedWeightProduct[] weightProducts = {new PackagedWeightProduct(productPackaging, 10.0, new WeightProduct("1", "2"))};

    ProductBatch productBatch = new ProductBatch("xxx", weightProducts);

    @Test
    public void testGetDescription() {
        assertEquals(productBatch.getDescription(), "xxx");
    }

    @Test
    public void testGetProducts() {
        assertEquals(productBatch.getProducts(), weightProducts);
    }

    @Test
    public void testGetWeight() {
        assertEquals(productBatch.getWeight(), 15.0);
    }
}
