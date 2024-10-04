package br.com.alura.currencytranslation.models;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record ExchangeRatesAYRTech(@SerializedName("conversion_rates") Map<String, Double> conversionRates) {
}
