package ru.omsu.lab2;


import org.junit.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


public class FinanceReportTest {
    @Test
    public void testGetPaymentLen() {
        Payment[] payments = {new Payment("Pupkin A. A", 2, 10, 1990, 20000),
                new Payment("Ivanov F. E", 2, 10, 1990, 10000),
                new Payment("Sidorov V. S", 2, 10, 1990, 30000)};
        FinanceReport report = new FinanceReport(payments, "Kirov F. A", 1, 2, 1999);
        assertEquals(3, report.getPaymentsLen());

        Payment[] payments1 = {new Payment("Pupkin A. A", 2, 10, 1990, 20000),
                new Payment("Ivanov F. E", 2, 10, 1990, 10000),
                new Payment("Sidorov V. S", 2, 10, 1990, 30000),
                new Payment("Vasiliev V. S", 2, 7, 1990, 30000)
        };

        FinanceReport report1 = new FinanceReport(payments1, "Kirov F. A", 1, 2, 1999);
        assertEquals(4, report1.getPaymentsLen());
    }

    @Test
    public void testSetGetPayment() {
        Payment[] payments = new Payment[2];
        payments[0] = new Payment("Filin D.M.", 5, 10, 1991, 35000);
        payments[1] = new Payment("Gorin D.M.", 5, 10, 1991, 31000);
        FinanceReport report = new FinanceReport(payments, "Vasilcov T.N.", 8, 10, 2000);
        Payment newPayment = new Payment("Grigorenko L. K", 6, 11, 1991, 46000);
        report.setPayment(1, newPayment);
        assertEquals(newPayment, report.getPayment(1));
    }

    @Test
    public void testToString() {
        Payment[] payments = new Payment[2];
        payments[0] = new Payment("Isaev L.K.", 5, 10, 1991, 35000);
        payments[1] = new Payment("Kirillov N.A.", 5, 10, 1991, 31089);
        FinanceReport report = new FinanceReport(payments, "Vasilcov T.N.", 8, 10, 2000);
        String expectedString = "Автор: Vasilcov T.N., дата: 8.10.2000, Платежи:" +
                "Плательщик: Isaev L.K., дата: 5.10.1991, сумма: 350 руб. 0 коп." +
                "Плательщик: Kirillov N.A., дата: 5.10.1991, сумма: 310 руб. 89 коп.";
        assertEquals(expectedString, report.toString());
    }

    @Test
    public void testCopyConstructor() {
        Payment[] payments = new Payment[2];
        payments[0] = new Payment("Isaev L.K.", 5, 10, 1991, 35000);
        payments[1] = new Payment("Kirillov N.A.", 5, 10, 1991, 31089);
        FinanceReport report = new FinanceReport(payments, "Vasilcov T.N.", 8, 10, 2000);
        FinanceReport report1 = new FinanceReport(report);
        assertEquals(payments[1],report1.getPayment(1));
        assertEquals(report.getMonth(), report1.getMonth());
        report1.setDay(21);
        assertNotEquals(21, report.getDay());
        Payment newPayment = new Payment("Radoev L.K.", 10, 12, 2077, 900);
        //report1.setPayment(1, newPayment);
        report1.getPayment(1).setSumPayment(333);
        assertNotEquals(newPayment, report.getPayment(1));
    }


}