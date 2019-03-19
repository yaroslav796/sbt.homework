

public class Operator extends Person{
    String login;
    String vsp;

    public Operator(String login, String vsp) {
        super.name = login;
        this.vsp = vsp;
    }

    public ConvertionRequest createRequest(ConvertData convertData) throws Exception {
        return new ConvertionRequest(convertData.money, convertData.currency, getCurrencyRate(convertData.money.currency), getCurrencyRate(convertData.currency));
    }

    public double getCurrencyRate(Currency currency) {
        switch (currency.toString()){
            case "RUR": return 1;
            case "USD": return 64.39;
            case "EUR": return 73.07;
            default: return 0;
        }
    }
    public Operator() {}
}
