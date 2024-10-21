package org.example.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class BalanceSheetStatement {
    private Date endDate;
    private long cash;
    private long shortTermInvestments;
    private long netReceivables;
    private long inventory;
    private long otherCurrentAssets;
    private long totalCurrentAssets;
    private long longTermInvestments;
    private long propertyPlantEquipment;
    private int goodWill;
    private long intangibleAssets;
    private long otherAssets;
    private long deferredLongTermAssetCharges;
    private long totalAssets;
    private long accountsPayable;
    private long shortLongTermDebt;
    private long otherCurrentLiab;
    private long longTermDebt;
    private long otherLiab;
    private int minorityInterest;
    private long totalCurrentLiabilities;
    private long totalLiab;
    private long commonStock;
    private long retainedEarnings;
    private long treasuryStock;
    private long otherStockholderEquity;
    private long totalStockholderEquity;
    private long netTangibleAssets;
}