package ru.omsu.lab4;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FunctionalTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testError() {
        ExpFunction expFunction = new ExpFunction(1, 2, 1, 0);
        IntegralFunctional<ExpFunction> integralFunctional = new IntegralFunctional<>(30, 50);
        assertEquals(integralFunctional.calculate(expFunction), 0);
    }

    @Test
    public void testExpIntegral() {
        ExpFunction expFunction = new ExpFunction(1, 2, 1, 0);
        IntegralFunctional<ExpFunction> integralFunctional = new IntegralFunctional<>(1, 2);
        assertTrue(integralFunctional.calculate(expFunction) - 4.67 < 0.1);
    }

    @Test
    public void testSumFunctional() {
        SinFunction sinFunction = new SinFunction(0, 1, 1, 1);
        SumFunctional<SinFunction> sumFunctional = new SumFunctional<>(0, 0.5);
        assertTrue(sumFunctional.calculate(sinFunction) - 1.682 < 0.1);
    }
}
