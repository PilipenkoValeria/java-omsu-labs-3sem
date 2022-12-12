package ru.omsu.lab2;

import java.util.ArrayList;

public class FinanceReportProcessor {
    public static FinanceReport getPaymentsCharAt(FinanceReport report, char beginChar) {
        ArrayList<Payment> payments = new ArrayList<>();
        for (Payment tempPayment : report.getPayments()) {
            if (tempPayment.getFullName().startsWith(String.valueOf(beginChar))) {
                payments.add(tempPayment);
            }
        }
        return new FinanceReport(payments.toArray(new Payment[0]),
                report.getFullNameReporter(), report.getDay(), report.getMonth(), report.getYear());
    }

    public static FinanceReport getPaymentsLessPayment(FinanceReport report, int maxValue) {
        ArrayList<Payment> payments = new ArrayList<>();
        for (Payment tempPayment : report.getPayments()) {
            if (tempPayment.getSumPayment() < maxValue) {
                payments.add(tempPayment);
            }
        }
        return new FinanceReport(payments.toArray(new Payment[0]),
                report.getFullNameReporter(), report.getDay(), report.getMonth(), report.getYear());
    }
}

