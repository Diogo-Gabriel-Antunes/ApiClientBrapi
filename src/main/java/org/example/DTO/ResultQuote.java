package org.example.DTO;

import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getTwoHundredDayAverage() {
        return twoHundredDayAverage;
    }

    public void setTwoHundredDayAverage(double twoHundredDayAverage) {
        this.twoHundredDayAverage = twoHundredDayAverage;
    }

    public double getTwoHundredDayAverageChange() {
        return twoHundredDayAverageChange;
    }

    public void setTwoHundredDayAverageChange(double twoHundredDayAverageChange) {
        this.twoHundredDayAverageChange = twoHundredDayAverageChange;
    }

    public double getTwoHundredDayAverageChangePercent() {
        return twoHundredDayAverageChangePercent;
    }

    public void setTwoHundredDayAverageChangePercent(double twoHundredDayAverageChangePercent) {
        this.twoHundredDayAverageChangePercent = twoHundredDayAverageChangePercent;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public double getRegularMarketChange() {
        return regularMarketChange;
    }

    public void setRegularMarketChange(double regularMarketChange) {
        this.regularMarketChange = regularMarketChange;
    }

    public double getRegularMarketChangePercent() {
        return regularMarketChangePercent;
    }

    public void setRegularMarketChangePercent(double regularMarketChangePercent) {
        this.regularMarketChangePercent = regularMarketChangePercent;
    }

    public Object getRegularMarketTime() {
        return regularMarketTime;
    }

    public void setRegularMarketTime(Object regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    public double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
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

    public double getRegularMarketDayLow() {
        return regularMarketDayLow;
    }

    public void setRegularMarketDayLow(double regularMarketDayLow) {
        this.regularMarketDayLow = regularMarketDayLow;
    }

    public int getRegularMarketVolume() {
        return regularMarketVolume;
    }

    public void setRegularMarketVolume(int regularMarketVolume) {
        this.regularMarketVolume = regularMarketVolume;
    }

    public double getRegularMarketPreviousClose() {
        return regularMarketPreviousClose;
    }

    public void setRegularMarketPreviousClose(double regularMarketPreviousClose) {
        this.regularMarketPreviousClose = regularMarketPreviousClose;
    }

    public double getRegularMarketOpen() {
        return regularMarketOpen;
    }

    public void setRegularMarketOpen(double regularMarketOpen) {
        this.regularMarketOpen = regularMarketOpen;
    }

    public int getAverageDailyVolume3Month() {
        return averageDailyVolume3Month;
    }

    public void setAverageDailyVolume3Month(int averageDailyVolume3Month) {
        this.averageDailyVolume3Month = averageDailyVolume3Month;
    }

    public int getAverageDailyVolume10Day() {
        return averageDailyVolume10Day;
    }

    public void setAverageDailyVolume10Day(int averageDailyVolume10Day) {
        this.averageDailyVolume10Day = averageDailyVolume10Day;
    }

    public double getFiftyTwoWeekLowChange() {
        return fiftyTwoWeekLowChange;
    }

    public void setFiftyTwoWeekLowChange(double fiftyTwoWeekLowChange) {
        this.fiftyTwoWeekLowChange = fiftyTwoWeekLowChange;
    }

    public String getFiftyTwoWeekRange() {
        return fiftyTwoWeekRange;
    }

    public void setFiftyTwoWeekRange(String fiftyTwoWeekRange) {
        this.fiftyTwoWeekRange = fiftyTwoWeekRange;
    }

    public double getFiftyTwoWeekHighChange() {
        return fiftyTwoWeekHighChange;
    }

    public void setFiftyTwoWeekHighChange(double fiftyTwoWeekHighChange) {
        this.fiftyTwoWeekHighChange = fiftyTwoWeekHighChange;
    }

    public double getFiftyTwoWeekHighChangePercent() {
        return fiftyTwoWeekHighChangePercent;
    }

    public void setFiftyTwoWeekHighChangePercent(double fiftyTwoWeekHighChangePercent) {
        this.fiftyTwoWeekHighChangePercent = fiftyTwoWeekHighChangePercent;
    }

    public double getFiftyTwoWeekLow() {
        return fiftyTwoWeekLow;
    }

    public void setFiftyTwoWeekLow(double fiftyTwoWeekLow) {
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }

    public double getFiftyTwoWeekHigh() {
        return fiftyTwoWeekHigh;
    }

    public void setFiftyTwoWeekHigh(double fiftyTwoWeekHigh) {
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
    }

    public double getPriceEarnings() {
        return priceEarnings;
    }

    public void setPriceEarnings(double priceEarnings) {
        this.priceEarnings = priceEarnings;
    }

    public double getEarningsPerShare() {
        return earningsPerShare;
    }

    public void setEarningsPerShare(double earningsPerShare) {
        this.earningsPerShare = earningsPerShare;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    public String getUsedInterval() {
        return usedInterval;
    }

    public void setUsedInterval(String usedInterval) {
        this.usedInterval = usedInterval;
    }

    public String getUsedRange() {
        return usedRange;
    }

    public void setUsedRange(String usedRange) {
        this.usedRange = usedRange;
    }

    public ArrayList<HistoricalDataPrice> getHistoricalDataPrice() {
        return historicalDataPrice;
    }

    public void setHistoricalDataPrice(ArrayList<HistoricalDataPrice> historicalDataPrice) {
        this.historicalDataPrice = historicalDataPrice;
    }

    public ArrayList<String> getValidRanges() {
        return validRanges;
    }

    public void setValidRanges(ArrayList<String> validRanges) {
        this.validRanges = validRanges;
    }

    public ArrayList<String> getValidIntervals() {
        return validIntervals;
    }

    public void setValidIntervals(ArrayList<String> validIntervals) {
        this.validIntervals = validIntervals;
    }

    public BalanceSheetHistory getBalanceSheetHistory() {
        return balanceSheetHistory;
    }

    public void setBalanceSheetHistory(BalanceSheetHistory balanceSheetHistory) {
        this.balanceSheetHistory = balanceSheetHistory;
    }

    public DividendsData getDividendsData() {
        return dividendsData;
    }

    public void setDividendsData(DividendsData dividendsData) {
        this.dividendsData = dividendsData;
    }

    public SummaryProfile getSummaryProfile() {
        return summaryProfile;
    }

    public void setSummaryProfile(SummaryProfile summaryProfile) {
        this.summaryProfile = summaryProfile;
    }

    public double getFiftyTwoWeekLowChangePercent() {
        return fiftyTwoWeekLowChangePercent;
    }

    public void setFiftyTwoWeekLowChangePercent(double fiftyTwoWeekLowChangePercent) {
        this.fiftyTwoWeekLowChangePercent = fiftyTwoWeekLowChangePercent;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
