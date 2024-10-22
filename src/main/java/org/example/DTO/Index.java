package org.example.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Index {
    private String stock;
    private String name;

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
