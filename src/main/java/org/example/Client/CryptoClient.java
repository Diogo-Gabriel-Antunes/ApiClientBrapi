package org.example.Client;

import org.example.DTO.ResponseCoin;

public class CoinClient {


    public ResponseCoin GetCoinsAvailable(String search){
        EndPointBuilder builder = new EndPointBuilder();

        if(search != null && !search.isEmpty()){
            builder.addParam("search=" + search);
        }

        return ApiClient.send(builder,ResponseCoin.class);
    }
}
