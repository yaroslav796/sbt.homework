package ru.sbt.homework;

public interface ICurrencyConverter {
    ConvertionResult convert (ConvertData data, Operator operator) throws Exception;
}
