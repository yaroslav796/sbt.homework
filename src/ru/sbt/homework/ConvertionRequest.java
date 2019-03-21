package ru.sbt.homework;

public class ConvertionRequest {
    Money money;
    Currency currency;
    double fromRate;
    double toRate;
    static int counter;

    public ConvertionRequest(Money money, Currency currency, double fromRate, double toRate) {
        this.money = money;
        this.currency = currency;
        this.fromRate = fromRate;
        this.toRate = toRate;
        this.counter++;
    }
}
