package ru.omsu.lab2;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FinanceReportProcessorTest {
    @Test
    public void testGetPaymentsCharAt(){
        Payment[] payments = new Payment[4];
        payments[0] = new Payment("Kureev L. K",19,6,2020,1000);
        payments[1] = new Payment("Moskovchev A. L",12,10,2020,10000);
        payments[2] = new Payment("Ivanov P.L",1,3,2020,3000);
        payments[3] = new Payment("Miksturkin N.A",31,7,2020,4200);
        FinanceReport financeReport = new FinanceReport(payments, "Frolov I.A", 12, 2, 2020);

        Payment[] actualPayments = new Payment[]{payments[1], payments[3]};
        FinanceReport expectedRes = new FinanceReport(actualPayments, "Frolov I.A", 12, 2, 2020);

        assertEquals(expectedRes, FinanceReportProcessor.getPaymentsCharAt(financeReport, 'M'));

    }

    @Test
    public void testGetPaymentsLessPayment(){
        Payment[] payments = new Payment[4];
        payments[0] = new Payment("Kureev L. K",19,6,2020,100000);
        payments[1] = new Payment("Moskovchev A. L",12,10,2020,9999);
        payments[2] = new Payment("Ivanov P.L",1,3,2020,3000);
        payments[3] = new Payment("Miksturkin N.A",31,7,2020,42000);
        FinanceReport financeReport = new FinanceReport(payments, "Frolov I.A", 12, 2, 2020);

        Payment[] actualPayments = new Payment[]{payments[1], payments[2]};
        FinanceReport expectedRes = new FinanceReport(actualPayments, "Frolov I.A", 12, 2, 2020);

        assertEquals(expectedRes, FinanceReportProcessor.getPaymentsLessPayment(financeReport, 10000));
    }


}