package ru.sbt.homework;

public class Operator extends Person{
    String login;
    String vsp;

    public Operator(String login, String vsp) {
        super.name = login;
        this.vsp = vsp;
    }

    public Operator() {}

    public ConvertionRequest createRequest(ConvertData convertData) throws ConverterException {

        CentralBankService centralBankService = new CentralBankService();

        double fromRate = centralBankService.getCurrentRate(convertData.money.currency);
        double toRate = centralBankService.getCurrentRate(convertData.currency);

        return new ConvertionRequest(convertData.money, convertData.currency, fromRate, toRate);
    }

    public Boolean check(Client client){
        boolean clientCheck = false;
        if (client.document != null){
            clientCheck = true;
        }
        return clientCheck;
    }

}
