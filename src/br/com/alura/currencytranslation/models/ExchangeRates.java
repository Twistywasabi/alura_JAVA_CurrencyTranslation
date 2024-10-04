package br.com.alura.currencytranslation.models;


import java.util.Map;

public class ExchangeRates {

    private Map<String, Double> conversionRates;

    public ExchangeRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "conversionRates=" + conversionRates +
                '}';
    }

    public void convertBrazilCurrencyToDollar(double brazilValue){
        double dollarConversion = conversionRates.get("BRL");
        double returnDollarConversion = brazilValue * (1/dollarConversion);
        System.out.println(returnDollarConversion);
    }

}



