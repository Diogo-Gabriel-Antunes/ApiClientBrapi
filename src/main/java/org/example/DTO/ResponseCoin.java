package org.example.DTO;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;


@JsonSerialize
public class ResponseCoin {
    private ArrayList<Currency> currency;

    public ArrayList<Currency> getCurrency() {
        return currency;
    }

    public void setCurrency(ArrayList<Currency> currency) {
        this.currency = currency;
    }
}


