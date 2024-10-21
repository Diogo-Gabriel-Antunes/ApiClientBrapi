package org.example.DTO;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
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

