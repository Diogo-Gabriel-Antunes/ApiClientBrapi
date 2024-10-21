package org.example.DTO;

import lombok.Data;

import java.util.Date;


@Data
public class DefaultKeyStatistics {
    private int priceHint;
    private long enterpriseValue;
    private double forwardPE;
    private double profitMargins;
    private long floatShares;
    private long sharesOutstanding;
    private double heldPercentInsiders;
    private double heldPercentInstitutions;
    private double beta;
    private long impliedSharesOutstanding;
    private Object category;
    private double bookValue;
    private double priceToBook;
    private Object fundFamily;
    private Object legalType;
    private Date lastFiscalYearEnd;
    private Date nextFiscalYearEnd;
    private Date mostRecentQuarter;
    private double earningsQuarterlyGrowth;
    private long netIncomeToCommon;
    private double trailingEps;
    private double forwardEps;
    private double pegRatio;
    private String lastSplitFactor;
    private int lastSplitDate;
    private double enterpriseToRevenue;
    private double enterpriseToEbitda;
    private double _52WeekChange;
    private double sandP52WeekChange;
    private double lastDividendValue;
    private Date lastDividendDate;
}
