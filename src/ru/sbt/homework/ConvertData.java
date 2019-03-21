package ru.sbt.homework;

public class ConvertData {
    Client client;
    Money money;
    Currency currency;

    public ConvertData(Client client, Money money, Currency currency) {
        this.client = client;
        this.money = money;
        this.currency = currency;
    }
}
