public class CurrencyConverter implements ICurrencyConverter{

    @Override
    public ConvertionResult convert(ConvertData convertData, Operator operator) throws Exception {
        double fromCashSum = convertData.money.cash;
        double fromCashRate = operator.createRequest(convertData).fromRate;
        double toCashRate = operator.createRequest(convertData).toRate;

        double convertionResult = (fromCashSum * fromCashRate) / toCashRate;

        Money toMoney = new Money(operator.createRequest(convertData).currency, convertionResult);

        return new ConvertionResult(convertData.money, toMoney);
    }
}
