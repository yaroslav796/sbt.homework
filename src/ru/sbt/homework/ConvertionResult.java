package ru.sbt.homework;

public class ConvertionResult {
    Money fromMoney;
    Money toMoney;
    ConvertionStatus convertionStatus;

    public ConvertionResult(Money fromMoney, Money toMoney, ConvertionStatus convertionStatus) {
        this.fromMoney = fromMoney;
        this.toMoney = toMoney;
        this.convertionStatus = convertionStatus;
    }
}
