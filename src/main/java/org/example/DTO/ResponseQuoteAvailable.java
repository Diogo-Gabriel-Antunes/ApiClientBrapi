package org.example.DTO;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;



@JsonSerialize
public class ResponseQuoteAvailable {
    private List<String> indexes;
    private List<String> stocks;

    public List<String> getIndexes() {
        return indexes;
    }

    public void setIndexes(List<String> indexes) {
        this.indexes = indexes;
    }

    public List<String> getStocks() {
        return stocks;
    }

    public void setStocks(List<String> stocks) {
        this.stocks = stocks;
    }
}
