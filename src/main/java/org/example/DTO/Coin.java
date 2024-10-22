package org.example.DTO;



import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getCurrencyRateFromUSD() {
        return currencyRateFromUSD;
    }

    public void setCurrencyRateFromUSD(double currencyRateFromUSD) {
        this.currencyRateFromUSD = currencyRateFromUSD;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public double getRegularMarketChange() {
        return regularMarketChange;
    }

    public void setRegularMarketChange(double regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    public double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    public double getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    public void setRegularMarketChangePercent(double regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

    public double getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    public void setRegularMarketDayLow(double regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    public double getRegularMarketDayHigh() {
        return regularMarketDayHigh;
    }

    public void setRegularMarketDayHigh(double regularMarketDayHigh) {
        this.regularMarketDayHigh = regularMarketDayHigh;
    }

    public String getRegularMarketDayRange() {
        return regularMarketDayRange;
    }

    public void setRegularMarketDayRange(String regularMarketDayRange) {
        this.regularMarketDayRange = regularMarketDayRange;
    }

    public double getRegularMarketVolume() {
        return regularMarketVolume;
    }

    public void setRegularMarketVolume(double regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public int getRegularMarketTime() {
        return regularMarketTime;
    }

    public void setRegularMarketTime(int regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    public String getCoinImageUrl() {
        return coinImageUrl;
    }

    public void setCoinImageUrl(String coinImageUrl) {
        this.coinImageUrl = coinImageUrl;
    }
}
