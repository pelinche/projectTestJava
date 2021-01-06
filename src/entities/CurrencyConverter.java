package entities;

public class CurrencyConverter {
    public double dollarPrice;
    public double ammount;

    public double valueInReals(){
        double valor = dollarPrice * ammount;
        return  valor + (valor *  6 / 100);
    }
}
