package br.com.alura.currencytranslation.models;


import java.util.Map;
import java.util.Scanner;

public class ExchangeRates {

    Scanner reading = new Scanner(System.in);
    private Map<String, Double> conversionRates;
    Currency defaultCurrency = new Currency("USD", 1.0);
    double valueToConvert;

    public ExchangeRates(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }

    public Map<String, Double> getConversionRates() {
        return conversionRates;
    }

    public void convertUsdBrl(boolean directConvert){
        double usdRateToBrl = conversionRates.get("BRL");
        System.out.println("Digite o valor que deseja converter: ");
        this.valueToConvert = reading.nextDouble();
        if (directConvert) {
            this.defaultCurrency.setTypeCurrency("BRL");
            this.defaultCurrency.setValueCurrency(valueToConvert);
            Currency currencyBrlUsd = new Currency("USD", valueToConvert * (1/ usdRateToBrl));
            System.out.println("Valor " + this.defaultCurrency.getValueCurrency() + " [" + defaultCurrency.getTypeCurrency() + "]" + " corresponde ao valor final de " + currencyBrlUsd.getValueCurrency() + " [" + currencyBrlUsd.getTypeCurrency() + "]");
        } else {
            this.defaultCurrency.setTypeCurrency("USD");
            this.defaultCurrency.setValueCurrency(valueToConvert);
            Currency currencyBrlUsd = new Currency("BRL", valueToConvert * usdRateToBrl);
            System.out.println("Valor "  + this.defaultCurrency.getValueCurrency() + " [" + defaultCurrency.getTypeCurrency() + "]" + " corresponde ao valor final de " + currencyBrlUsd.getValueCurrency() + " [" + currencyBrlUsd.getTypeCurrency() + "]");
        }
    }

    public void convertUsdArs(boolean directConvert){
        double usdRateToArs = conversionRates.get("ARS");
        System.out.println("Digite o valor que deseja converter: ");
        this.valueToConvert = reading.nextDouble();
        if (directConvert) {
            this.defaultCurrency.setTypeCurrency("ARS");
            this.defaultCurrency.setValueCurrency(valueToConvert);
            Currency currencyArsUsd = new Currency("USD", valueToConvert * (1/ usdRateToArs));
            System.out.println("Valor " + this.defaultCurrency.getValueCurrency() + " [" + defaultCurrency.getTypeCurrency() + "]" + " corresponde ao valor final de " + currencyArsUsd.getValueCurrency() + " [" + currencyArsUsd.getTypeCurrency() + "]");
        } else {
            this.defaultCurrency.setTypeCurrency("USD");
            this.defaultCurrency.setValueCurrency(valueToConvert);
            Currency currencyArsUsd = new Currency("ARS", valueToConvert * usdRateToArs);
            System.out.println("Valor "  + this.defaultCurrency.getValueCurrency() + " [" + defaultCurrency.getTypeCurrency() + "]" + " corresponde ao valor final de " + currencyArsUsd.getValueCurrency() + " [" + currencyArsUsd.getTypeCurrency() + "]");
        }
    }

    public void convertUsdCop(boolean directConvert){
        double usdRateToCop = conversionRates.get("COP");
        System.out.println("Digite o valor que deseja converter: ");
        this.valueToConvert = reading.nextDouble();
        if (directConvert) {
            this.defaultCurrency.setTypeCurrency("COP");
            this.defaultCurrency.setValueCurrency(valueToConvert);
            Currency currencyCopUsd = new Currency("USD", valueToConvert * (1/ usdRateToCop));
            System.out.println("Valor " + this.defaultCurrency.getValueCurrency() + " [" + defaultCurrency.getTypeCurrency() + "]" + " corresponde ao valor final de " + currencyCopUsd.getValueCurrency() + " [" + currencyCopUsd.getTypeCurrency() + "]");
        } else {
            this.defaultCurrency.setTypeCurrency("USD");
            this.defaultCurrency.setValueCurrency(valueToConvert);
            Currency currencyCopUsd = new Currency("COP", valueToConvert * usdRateToCop);
            System.out.println("Valor "  + this.defaultCurrency.getValueCurrency() + " [" + defaultCurrency.getTypeCurrency() + "]" + " corresponde ao valor final de " + currencyCopUsd.getValueCurrency() + " [" + currencyCopUsd.getTypeCurrency() + "]");
        }
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "conversionRates=" + conversionRates +
                '}';
    }

}



