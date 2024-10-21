package org.example.DTO;



import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class Coin{
    private String currency;
    private double currencyRateFromUSD;
    private String coinName;
    private String coin;
    private double regularMarketChange;
    private double regularMarketPrice;
    private double regularMarketChangePercent;
    private double regularMarketDayLow;
    private double regularMarketDayHigh;
    private String regularMarketDayRange;
    private double regularMarketVolume;
    private double marketCap;
    private int regularMarketTime;
    private String coinImageUrl;
}
