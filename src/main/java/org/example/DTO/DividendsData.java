package org.example.DTO;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DividendsData{
    private ArrayList<CashDividend> cashDividends;
    private ArrayList<StockDividend> stockDividends;
    private ArrayList<Object> subscriptions;
}
