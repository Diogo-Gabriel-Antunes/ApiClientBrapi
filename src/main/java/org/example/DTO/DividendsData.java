package org.example.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;


@JsonSerialize
public class DividendsData{
    private ArrayList<CashDividend> cashDividends;
    private ArrayList<StockDividend> stockDividends;
    private ArrayList<Object> subscriptions;

    public ArrayList<CashDividend> getCashDividends() {
        return cashDividends;
    }

    public void setCashDividends(ArrayList<CashDividend> cashDividends) {
        this.cashDividends = cashDividends;
    }

    public ArrayList<StockDividend> getStockDividends() {
        return stockDividends;
    }

    public void setStockDividends(ArrayList<StockDividend> stockDividends) {
        this.stockDividends = stockDividends;
    }

    public ArrayList<Object> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(ArrayList<Object> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
