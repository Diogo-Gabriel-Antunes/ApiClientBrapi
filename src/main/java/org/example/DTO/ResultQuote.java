package org.example.DTO;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class ResultQuote {
    private String symbol;
    private String currency;
    private double twoHundredDayAverage;
    private double twoHundredDayAverageChange;
    private double twoHundredDayAverageChangePercent;
    private long marketCap;
    private String shortName;
    private String longName;
    private double regularMarketChange;
    private double regularMarketChangePercent;
    private Object regularMarketTime;
    private double regularMarketPrice;
    private double regularMarketDayHigh;
    private String regularMarketDayRange;
    private double regularMarketDayLow;
    private int regularMarketVolume;
    private double regularMarketPreviousClose;
    private double regularMarketOpen;
    private int averageDailyVolume3Month;
    private int averageDailyVolume10Day;
    private double fiftyTwoWeekLowChange;
    private String fiftyTwoWeekRange;
    private double fiftyTwoWeekHighChange;
    private double fiftyTwoWeekHighChangePercent;
    private double fiftyTwoWeekLow;
    private double fiftyTwoWeekHigh;
    private double priceEarnings;
    private double earningsPerShare;
    private String logourl;
    private String usedInterval;
    private String usedRange;
    private ArrayList<HistoricalDataPrice> historicalDataPrice;
    private ArrayList<String> validRanges;
    private ArrayList<String> validIntervals;
    private BalanceSheetHistory balanceSheetHistory;
    private DividendsData dividendsData;
    private SummaryProfile summaryProfile;
    private double fiftyTwoWeekLowChangePercent;
    private String updatedAt;
}
