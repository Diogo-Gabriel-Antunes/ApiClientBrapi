package org.example.Client;

import org.example.DTO.ResponseCrypto;
import org.example.DTO.ResponseCryptoAvailable;

import java.util.List;

public class CryptoClient {
    public ResponseCryptoAvailable GetCryptoAvailable(String search) {
        EndPointBuilder builder = EndPointBuilder.create("/v2/crypto/available");

        if (search != null && !search.isEmpty()) {
            builder.addParam("search=" + search);
        }

        return ApiClient.send(builder ,ResponseCryptoAvailable.class);
    }


    public ResponseCrypto GetCrypto(List<String> coin,String currency) {
        EndPointBuilder builder = EndPointBuilder.create("/v2/crypto");

        if (coin != null && !coin.isEmpty()) {
            builder.addParam("coin=" + coin.toString().replace("[" ,"").replace("]" ,""));
        }

        if(currency != null && !currency.isEmpty()){
            builder.addParam("currency=" + currency);
        }

        return ApiClient.send(builder ,ResponseCrypto.class);
    }
}
