package ru.sbt.homework;

public class Printer {
    public void print(ConvertionResult convertionResult){

        if (convertionResult.convertionStatus.code == 0){
            System.out.println("Операция конвертации завершена...");
            System.out.println(convertionResult.convertionStatus.message);
            System.out.printf("Получено от клиента: %.2f %s\n", convertionResult.fromMoney.cash, convertionResult.fromMoney.currency);
            System.out.printf("Необходимо перевести в валюту: %s\n", convertionResult.toMoney.currency);
            System.out.printf("Отдано клиенту: %.2f %s\n", convertionResult.toMoney.cash, convertionResult.toMoney.currency);
        } else {
            System.out.println("Операция конвертации завершена...");
            System.out.println(convertionResult.convertionStatus.message);
            System.out.println("Причина: Пользователь не прошел проверку. Операция не выполнилась");
        }
    }
}
