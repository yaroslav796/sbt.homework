package ru.sbt.homework;

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
        ManagmentService managmentService = new ManagmentService();
        Operator operator = managmentService.getTodayOperator();

        ProgrammDataSource programmDataSource = new ProgrammDataSource();
        DUL dul = programmDataSource.documentCreator("1234", "1231", "1231234", "777-000", new Date());
        Client client = programmDataSource.createClient("Ivanov Ivan", new Date(), dul);

        Money clienMoney = new Money(Currency.EUR, 100);
        ConvertData convertData = new ConvertData(client, clienMoney, Currency.RUR);

        CurrencyConverter currencyConverter = new CurrencyConverter();
        ConvertionResult convertionResult = currencyConverter.convert(convertData, operator);
        Printer printer = new Printer();
        printer.print(convertionResult);
//        Converter converter = new Converter(client, printer);

    }
}
