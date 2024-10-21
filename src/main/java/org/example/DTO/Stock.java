package org.example.DTO;

import lombok.Data;

@Data
public class Stock{
    private String stock;
    private String name;
    private double close;
    private double change;
    private int volume;
    private double market_cap;
    private String logo;
    private String sector;
    private String type;
}

