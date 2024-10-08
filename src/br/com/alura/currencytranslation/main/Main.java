package br.com.alura.currencytranslation.main;

import br.com.alura.currencytranslation.models.ExchangeRates;
import br.com.alura.currencytranslation.models.ExchangeRatesAYRTech;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        int i = 0;
        Scanner userInput = new Scanner(System.in);
        Gson gson = new Gson();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/7d61ff25c057c9d073e854d8/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        if (response.statusCode() == 403) {
            System.out.println("Erro no sistema na parte da URL de requisição, entre em contato com o administrador do sistema...");
            return;
        }

        ExchangeRatesAYRTech exchangeRatesListAYRTech = gson.fromJson(json, ExchangeRatesAYRTech.class);
        ExchangeRates exchangeRatesList = new ExchangeRates(exchangeRatesListAYRTech.conversionRates());
        System.out.println("**************************************************");
        System.out.println("Seja bem vindo/a ao Conversor de moedas :]");
        System.out.println("**************************************************");
        String menu = """
                    
                    1) Dólar ==> Peso Argentino
                    2) Peso Argentino ==> Dólar
                    3) Dólar ==> Real Brasileiro
                    4) Real Brasileiro ==> Dólar
                    5) Dólar ==> Peso Colombiano
                    6) Peso Colombiano ==> Dólar
                    7) Sair
                    
                    Selecione uma opção válida:
                    """;

        while (i != 7){

            System.out.println(menu);
            try {
                i =userInput.nextInt();
                switch (i) {
                    case 1:
                        exchangeRatesList.convertUsdArs(false);
                        break;
                    case 2:
                        exchangeRatesList.convertUsdArs(true);
                        break;
                    case 3:
                        exchangeRatesList.convertUsdBrl(false);
                        break;
                    case 4:
                        exchangeRatesList.convertUsdBrl(true);
                        break;
                    case 5:
                        exchangeRatesList.convertUsdCop(false);
                        break;
                    case 6:
                        exchangeRatesList.convertUsdCop(true);
                        break;
                    case 7:
                        System.out.println("saindo do sistema...");
                        break;
                    default:
                        System.out.println("Digite um número válido");
                        System.out.println("**************************************************");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Aconteceu um erro: digite somente números inteiros de 1 a 7");
                System.out.println(e.getMessage());
                userInput.nextLine();
            }


        }




    }
}
