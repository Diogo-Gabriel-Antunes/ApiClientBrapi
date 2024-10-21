package org.example.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;

import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class DividendsData{
    private ArrayList<CashDividend> cashDividends;
    private ArrayList<StockDividend> stockDividends;
    private ArrayList<Object> subscriptions;
}
