package br.com.alura.currencytranslation.models;

public class Currency {
    private String typeCurrency;
    private double valueCurrency;

    public String getTypeCurrency() {
        return typeCurrency;
    }

    public double getValueCurrency() {
        return valueCurrency;
    }

    public Currency(String typeCurrency, double valueCurrency) {
        this.typeCurrency = typeCurrency;
        this.valueCurrency = valueCurrency;
    }

    public void setTypeCurrency(String typeCurrency) {
        this.typeCurrency = typeCurrency;
    }

    public void setValueCurrency(double valueCurrency) {
        this.valueCurrency = valueCurrency;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "typeCurrency='" + typeCurrency + '\'' +
                ", valueCurrency=" + valueCurrency +
                '}';
    }
}
