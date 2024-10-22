package org.example.DTO;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Currency{
    private String name;
    private String currency;
    private String fromCurrency;
    private String toCurrency;
    private String high;
    private String low;
    private String bidVariation;
    private String percentageChange;
    private String bidPrice;
    private String askPrice;
    private String updatedAtTimestamp;
    private String updatedAtDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getBidVariation() {
        return bidVariation;
    }

    public void setBidVariation(String bidVariation) {
        this.bidVariation = bidVariation;
    }

    public String getPercentageChange() {
        return percentageChange;
    }

    public void setPercentageChange(String percentageChange) {
        this.percentageChange = percentageChange;
    }

    public String getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    public String getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(String askPrice) {
        this.askPrice = askPrice;
    }

    public String getUpdatedAtTimestamp() {
        return updatedAtTimestamp;
    }

    public void setUpdatedAtTimestamp(String updatedAtTimestamp) {
        this.updatedAtTimestamp = updatedAtTimestamp;
    }

    public String getUpdatedAtDate() {
        return updatedAtDate;
    }

    public void setUpdatedAtDate(String updatedAtDate) {
        this.updatedAtDate = updatedAtDate;
    }
}
