package ru.omsu.lab2;

import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private Payment[] payments;
    private String fullNameReporter;
    private int day, month, year;


    public FinanceReport(Payment[] payments, String fullNameReporter, int day, int month, int year) {
        this.payments = payments;
        this.fullNameReporter = fullNameReporter;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Payment[] getPayments() {
        return payments;
    }

    public void setPayments(Payment[] payments) {
        this.payments = payments;
    }

    public String getFullNameReporter() {
        return fullNameReporter;
    }

    public void setFullNameReporter(String fullNameReporter) {
        this.fullNameReporter = fullNameReporter;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPaymentsLen() {
        return payments.length;
    }

    public void setPayment(int index, Payment payment) {
        payments[index] = payment;
    }

    public Payment getPayment(int index) {
        return payments[index];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(String.format("Автор: %s, дата: %d.%d.%d, Платежи:",
                fullNameReporter, day, month, year));
        for (Payment tempPayment : payments) {
            result.append(tempPayment.toString());
        }
        //result.append("]]");
        return result.toString();
    }

    public FinanceReport(FinanceReport report) {
        this.payments = new Payment[report.payments.length];
        for (int i = 0; i < report.payments.length; i++) {
            this.payments[i] = new Payment(report.payments[i]);
        }
        this.fullNameReporter = report.fullNameReporter;
        this.day = report.getDay();
        this.month = report.getMonth();
        this.year = report.getYear();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return day == that.day &&
                month == that.month &&
                year == that.year &&
                Arrays.equals(payments, that.payments) &&
                Objects.equals(fullNameReporter, that.fullNameReporter);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fullNameReporter, day, month, year);
        result = 31 * result + Arrays.hashCode(payments);
        return result;
    }
}

