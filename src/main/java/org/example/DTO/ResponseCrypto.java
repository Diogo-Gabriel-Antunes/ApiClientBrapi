package org.example.DTO;


import java.util.ArrayList;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;



@JsonSerialize
public class ResponseCrypto{
    private ArrayList<Coin> coins;

    public ArrayList<Coin> getCoins() {
        return coins;
    }

    public void setCoins(ArrayList<Coin> coins) {
        this.coins = coins;
    }
}


