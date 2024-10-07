package br.com.alura.currencytranslation.main;

import br.com.alura.currencytranslation.models.ExchangeRates;
import br.com.alura.currencytranslation.models.ExchangeRatesAYRTech;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Gson gson = new Gson();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7d61ff25c057c9d073e854d8/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        ExchangeRatesAYRTech exchangeRatesListAYRTech = gson.fromJson(json, ExchangeRatesAYRTech.class);
        ExchangeRates exchangeRatesList = new ExchangeRates(exchangeRatesListAYRTech.conversionRates());
        System.out.println("exchangeRatesList converted");
        //exchangeRatesList.convertUsdArs(false);
        //exchangeRatesList.convertUsdBrl(false);
        exchangeRatesList.convertUsdCop(false);

    }
}
