public class Printer {
    public void print(ConvertionResult convertionResult){
        System.out.println("Обмен валюты произведен успешно.");
        System.out.printf("Получено от клиента: %.2f %s\n", convertionResult.fromMoney.cash, convertionResult.fromMoney.currency);
        System.out.printf("Необходимо перевести в валюту: %s\n", convertionResult.toMoney.currency);
        System.out.printf("Отдано клиенту: %.2f %s\n", convertionResult.toMoney.cash, convertionResult.toMoney.currency);
    }
}
