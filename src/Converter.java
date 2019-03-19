import java.util.Date;

public class Converter {

    Client client;
    Printer printer;

    public Converter(Client client, Printer printer) {
        this.client = client;
        this.printer = printer;
    }

    public Converter() {}

    public void run() throws Exception {
        Operator operator = new Operator("Lenivets Inna", "Kakoi to vsp");

        DUL dul = new DUL();
        dul.type = "11111";
        dul.seria = "666666";
        dul.number = "2222";
        dul.code = "777-222";
        dul.date = new Date();

        Client client = new Client("Vasili Ivanovich", new Date(), dul);
        Money clienMoney = new Money(Currency.RUR, 1000);

        ConvertData convertData = new ConvertData(client, clienMoney, Currency.EUR);
        CurrencyConverter currencyConverter = new CurrencyConverter();
        ConvertionResult convertionResult = currencyConverter.convert(convertData, operator);
        Printer printer = new Printer();
        printer.print(convertionResult);
//        Converter converter = new Converter(client, printer);

    }
}
