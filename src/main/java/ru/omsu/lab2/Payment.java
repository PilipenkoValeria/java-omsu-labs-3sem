package ru.omsu.lab2;

import java.util.Objects;

public class Payment {
    private String fullName;
    private int day, month, year;
    private int sumPayment;

    public Payment(String fullName, int day, int month, int year, int sumPayment) {
        this.fullName = fullName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.sumPayment = sumPayment;
    }

    public Payment(Payment payment) {
        this.fullName = payment.getFullName();
        this.day = payment.day;
        this.month = payment.month;
        this.year = payment.year;
        this.sumPayment = payment.sumPayment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fio) {
        this.fullName = fullName;
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

    public int getSumPayment() {
        return sumPayment;
    }

    public void setSumPayment(int sumPayment) {
        this.sumPayment = sumPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return day == payment.day &&
                month == payment.month &&
                year == payment.year &&
                sumPayment == payment.sumPayment &&
                Objects.equals(fullName, payment.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, day, month, year, sumPayment);
    }

    @Override

    public String toString() {
        String result = String.format
                ("Плательщик: %s, дата: %d.%d.%d, сумма: %s руб. %s коп.",
                fullName, day, month, year, sumPayment/100, sumPayment%100);
        return result;
    }
}

