package ru.sbt.homework;

public class Money {
    Currency currency;
    double cash;

    public Money(Currency currency, double cash) {
        this.currency = currency;
        this.cash = cash;
    }

    public Money() {
    }
}
