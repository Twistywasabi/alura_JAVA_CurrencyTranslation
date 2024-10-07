package br.com.alura.currencytranslation.models;


import java.util.Map;
import java.util.Scanner;

public class ExchangeRates {

    Scanner reading = new Scanner(System.in);
    private Map<String, Double> conversionRates;
    double valueToConvert = 0.0;

    public ExchangeRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void setConversionRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }

    public void convertBrlToUsd(){
        double usdRateToBrl = conversionRates.get("BRL");
        System.out.println("Digite o valor que deseja converter: ");
        this.valueToConvert = reading.nextDouble();
        Currency currencyBrlInUsd = new Currency("BRL", valueToConvert * (1/ usdRateToBrl));
        System.out.println("Valor " + this.valueToConvert + " [" + currencyBrlInUsd.getTypeCurrency() + "]" + " corresponde ao valor final de " + currencyBrlInUsd.getValueCurrency() + " [USD]");
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "conversionRates=" + conversionRates +
                '}';
    }

}



