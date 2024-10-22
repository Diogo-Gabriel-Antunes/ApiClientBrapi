package org.example.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonSerialize
public class HistoricalDataPrice{
    private int date;
    private double myopen;
    private double high;
    private double low;
    private double close;
    private int volume;
    private double adjustedClose;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getMyopen() {
        return myopen;
    }

    public void setMyopen(double myopen) {
        this.myopen = myopen;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getAdjustedClose() {
        return adjustedClose;
    }

    public void setAdjustedClose(double adjustedClose) {
        this.adjustedClose = adjustedClose;
    }
}
