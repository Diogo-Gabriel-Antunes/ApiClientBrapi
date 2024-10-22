package org.example.Client;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.example.Client.ApiClient;


public class ApiClient {

    private final String mainPath = "https://brapi.dev/api";
    private HttpClient client;
    private HttpRequest request;

    public HttpClient getClient() {
        return client;
    }

    public HttpRequest getRequest() {
        return request;
    }

    public ApiClient(String endPoint) {
        this.client = HttpClient.newHttpClient();
        this.request = HttpRequest.newBuilder()
                .uri(URI.create(mainPath + endPoint))
                .header("Authorization","Bearer m2HTrpmjYr7LpRHBVy5goV")
                .GET()
                .build();
    }

    public ApiClient(EndPointBuilder endPoint) {
        this.client = HttpClient.newHttpClient();
        this.request = HttpRequest.newBuilder()
                .uri(URI.create(mainPath + endPoint.getEndPoint()))
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
    public static <T> T send(EndPointBuilder builder ,Class<T> t) {
        try{
            ApiClient api = new ApiClient(builder.getEndPoint());
            var response = api.getClient().send(api.getRequest(),HttpResponse.BodyHandlers.ofString());
            api.verifyStatusCode(response);
            Gson gson = new Gson();
            return gson.fromJson(response.body(),t);
        }catch (RuntimeException ex) {
            throw new RuntimeException(ex.getMessage());
        } catch (Throwable ex) {
            throw new RuntimeException("Erro indefinido na requisição");
        }
    }
}
