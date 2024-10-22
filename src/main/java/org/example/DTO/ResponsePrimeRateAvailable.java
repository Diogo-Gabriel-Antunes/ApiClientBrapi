package org.example.DTO;


import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize
public class ResponsePrimeRateAvailable {
    private ArrayList<String> countries;

    public ArrayList<String> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<String> countries) {
        this.countries = countries;
    }
}

