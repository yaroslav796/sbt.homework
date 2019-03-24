package ru.sbt.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Date;

public class Converter {

    Client client;
    Printer printer;
    ManagmentService managmentService;

    public Converter(Client client, Printer printer, ManagmentService managmentService) {
        this.client = client;
        this.printer = printer;
        this.managmentService = managmentService;
    }

    public Converter() {}

    public void run() throws Exception {
        System.out.println("Выберите источника данных: программный - 0, файл - 1, оба варианта - 2");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        switch (reader.readLine()){
            case "0": programmRun(); break;
            case "1": fileRun(); break;
            case "2": programmRun(); fileRun(); break;
            default: System.out.println("Указанного номера не существует"); break;
        }


    }

    private void programmRun() throws Exception {
        ManagmentService managmentService = new ManagmentService();
        Operator operator = managmentService.getTodayOperator();

        ProgrammDataSource programmDataSource = new ProgrammDataSource();
        DUL dul = programmDataSource.documentCreator("1234", "1231", "1231234", "777-000", new Date());
        Client client = programmDataSource.createClient("Ivanov Ivan", new Date(), dul);

        Money clienMoney = new Money(Currency.EUR, 100);
        ConvertData convertData = new ConvertData(client, clienMoney, Currency.RUB);

        CurrencyConverter currencyConverter = new CurrencyConverter();
        ConvertionResult convertionResult = currencyConverter.convert(convertData, operator);

        Printer printer = new Printer();
        printer.print(convertionResult);
    }

    private void fileRun() throws Exception {
        File file = new File("src\\resources\\clients.txt");
        FileDataSource fileDataSource = new FileDataSource(file);

        ManagmentService managmentService = new ManagmentService();
        Operator operator = managmentService.getTodayOperator();

        ConvertData convertData = fileDataSource.getConvertData();

        CurrencyConverter currencyConverter = new CurrencyConverter();
        ConvertionResult convertionResult = currencyConverter.convert(convertData, operator);

        Printer printer = new Printer();
        printer.print(convertionResult);
    }
}
