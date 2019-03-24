package ru.sbt.homework;

/**
 * Created by Yaroslav on 21.03.2019.
 */
public class CentralBankService {

    static final double RUB = 1;
    static final double USD = 64.39;
    static final double EUR = 73.07;

    public double getCurrentRate(Currency currency) throws ConverterException {

        switch (currency.toString()){
            case "RUB": return RUB;
            case "USD": return USD;
            case "EUR": return EUR;
            default: throw new ConverterException("Указанной валюты не существует: " + currency.name());
        }
    }
}

class ConverterException extends Exception{
    public ConverterException(String message){
        super(message);
    }
}
