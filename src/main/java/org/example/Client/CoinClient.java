package org.example.Client;

import org.example.DTO.ResponseCoin;
import org.example.DTO.ResponseCoinAvailable;

import java.util.List;

public class CoinClient {

    public ResponseCoinAvailable getCoinAvailable(String search) {
        EndPointBuilder builder = new EndPointBuilder();

        if (search != null && !search.isEmpty()) {
            builder.addParam("search=" + search);
        }

        return ApiClient.send(builder ,ResponseCoinAvailable.class);
    }

    public ResponseCoin getCoin(List<String> currency) {
        EndPointBuilder builder = new EndPointBuilder();

        if (currency != null && !currency.isEmpty()) {
            builder.addParam("currency=" + currency.toString().replace("[","").replace("]",""));
        }

        return ApiClient.send(builder ,ResponseCoin.class);
    }
}
