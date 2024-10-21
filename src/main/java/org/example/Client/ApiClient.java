package org.example.Client;

import lombok.Data;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Data
public class ApiClient {

    private final String mainPath = "https://brapi.dev/api";
    private HttpClient client;
    private HttpRequest request;

    public ApiClient(String endPoint) {
        this.client = HttpClient.newHttpClient();
        this.request = HttpRequest.newBuilder()
                .uri(URI.create(mainPath + endPoint))
                .header("Authorization","Bearer m2HTrpmjYr7LpRHBVy5goV")
                .GET()
                .build();
    }

    public void verifyStatusCode(HttpResponse response) {
        if(response.statusCode() == 400){
            throw new RuntimeException("Requisição mal formatada");
        }

        if(response.statusCode() == 401){
            throw new RuntimeException("Token invalido");
        }

        if(response.statusCode() == 402){
            throw new RuntimeException("Pague");
        }

        if(response.statusCode() == 404){
            throw new RuntimeException("Rota não encontrada");
        }

    }
}
