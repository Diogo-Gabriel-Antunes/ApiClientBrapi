package org.example.DTO;


import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize
public class ResponseInflation {
    private ArrayList<Inflation> inflation;

    public ArrayList<Inflation> getInflation() {
        return inflation;
    }

    public void setInflation(ArrayList<Inflation> inflation) {
        this.inflation = inflation;
    }
}

