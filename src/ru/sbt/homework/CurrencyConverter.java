package ru.sbt.homework;

public class CurrencyConverter implements ICurrencyConverter{

    @Override
    public ConvertionResult convert(ConvertData convertData, Operator operator) throws Exception {
        double fromCashSum = convertData.money.cash;
        double fromCashRate = operator.createRequest(convertData).fromRate;
        double toCashRate = operator.createRequest(convertData).toRate;
        double convertionResult = 0;
        ConvertionStatus convertionStatus;


        if (operator.check(convertData.client)){
            convertionResult = (fromCashSum * fromCashRate) / toCashRate;
            convertionStatus = new ConvertionStatus(0, "Обмен валюты произведен успешно.");
        } else {
            convertionStatus = new ConvertionStatus(1, "Обмен валюты произвести не удалось.");
        }

        Money toMoney = new Money(operator.createRequest(convertData).currency, convertionResult);


        return new ConvertionResult(convertData.money, toMoney, convertionStatus);
    }
}
