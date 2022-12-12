package ru.omsu.lab3.product;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.omsu.lab3.filter.BeginStringFilter;
import ru.omsu.lab3.filter.ContainsStringFilter;
import ru.omsu.lab3.filter.EndStringFilter;

import static org.testng.Assert.*;

public class ProductServiceTest {

    private ProductBatch batch;
    private ProductBatch weightBatch;

    @BeforeMethod
    public void setUp() {
        ProductPackaging productPackaging = new ProductPackaging("Коробка", 10.0);
        PieceProduct apple = new PieceProduct("Яблоки", "Зеленые", 100.0);
        PackagedPieceProduct appleBox = new PackagedPieceProduct(productPackaging, 10, apple);
        PackagedProductSet set = new PackagedProductSet("Фрукты", "Разные фрукты", productPackaging, appleBox, appleBox);
        batch = new ProductBatch("Партия товаров", appleBox,
                set, new PackagedProductSet("Овощи", "Разные овощи", productPackaging, appleBox, set));
        WeightProduct weightProduct = new WeightProduct("мороженое", "пломбир");
        PackagedWeightProduct iceCreamBox = new PackagedWeightProduct(productPackaging, 100.0, weightProduct);
        weightBatch = new ProductBatch("Партия мороженого", iceCreamBox);
    }


    @Test
    public void testCounter() {
        assertEquals(ProductService.countByFilter(batch, new BeginStringFilter("Яблоки")), 1);
        assertEquals(ProductService.countByFilter(batch, new ContainsStringFilter("к")), 2);
        assertEquals(ProductService.countByFilter(batch, new BeginStringFilter("Фрукты")), 1);
    }

    @Test
    public void testCheckAllWeighted() {
        assertFalse(ProductService.checkAllWeighted(batch));
        assertTrue(ProductService.checkAllWeighted(weightBatch));
    }

    @Test
    public void testDeepCounter() {
        assertEquals(ProductService.countByFilterDeep(batch, new BeginStringFilter("Яблоки")), 3);
        assertEquals(ProductService.countByFilterDeep(weightBatch, new EndStringFilter("мороженое")), 1);
    }
}