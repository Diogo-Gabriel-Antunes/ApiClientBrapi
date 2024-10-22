package org.example.DTO;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;


@JsonSerialize
public class ResponseCoinAvailable {
    private ArrayList<Currency> currencies;

    public ArrayList<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(ArrayList<Currency> currencies) {
        this.currencies = currencies;
    }
}

