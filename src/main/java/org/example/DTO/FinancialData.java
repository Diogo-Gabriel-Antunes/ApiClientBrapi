package org.example.DTO;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class FinancialData {
    private double currentPrice;
    private int targetHighPrice;
    private int targetLowPrice;
    private double targetMeanPrice;
    private double targetMedianPrice;
    private double recommendationMean;
    private String recommendationKey;
    private int numberOfAnalystOpinions;
    private long totalCash;
    private double totalCashPerShare;
    private long ebitda;
    private long totalDebt;
    private double quickRatio;
    private double currentRatio;
    private long totalRevenue;
    private double debtToEquity;
    private double revenuePerShare;
    private double returnOnAssets;
    private double returnOnEquity;
    private long grossProfits;
    private long freeCashflow;
    private long operatingCashflow;
    private double earningsGrowth;
    private double revenueGrowth;
    private double grossMargins;
    private double ebitdaMargins;
    private double operatingMargins;
    private double profitMargins;
    private String financialCurrency;
}
