package org.example.DTO;


import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;



@JsonSerialize
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public long getCash() {
        return cash;
    }

    public void setCash(long cash) {
        this.cash = cash;
    }

    public long getShortTermInvestments() {
        return shortTermInvestments;
    }

    public void setShortTermInvestments(long shortTermInvestments) {
        this.shortTermInvestments = shortTermInvestments;
    }

    public long getNetReceivables() {
        return netReceivables;
    }

    public void setNetReceivables(long netReceivables) {
        this.netReceivables = netReceivables;
    }

    public long getInventory() {
        return inventory;
    }

    public void setInventory(long inventory) {
        this.inventory = inventory;
    }

    public long getOtherCurrentAssets() {
        return otherCurrentAssets;
    }

    public void setOtherCurrentAssets(long otherCurrentAssets) {
        this.otherCurrentAssets = otherCurrentAssets;
    }

    public long getTotalCurrentAssets() {
        return totalCurrentAssets;
    }

    public void setTotalCurrentAssets(long totalCurrentAssets) {
        this.totalCurrentAssets = totalCurrentAssets;
    }

    public long getLongTermInvestments() {
        return longTermInvestments;
    }

    public void setLongTermInvestments(long longTermInvestments) {
        this.longTermInvestments = longTermInvestments;
    }

    public long getPropertyPlantEquipment() {
        return propertyPlantEquipment;
    }

    public void setPropertyPlantEquipment(long propertyPlantEquipment) {
        this.propertyPlantEquipment = propertyPlantEquipment;
    }

    public int getGoodWill() {
        return goodWill;
    }

    public void setGoodWill(int goodWill) {
        this.goodWill = goodWill;
    }

    public long getIntangibleAssets() {
        return intangibleAssets;
    }

    public void setIntangibleAssets(long intangibleAssets) {
        this.intangibleAssets = intangibleAssets;
    }

    public long getOtherAssets() {
        return otherAssets;
    }

    public void setOtherAssets(long otherAssets) {
        this.otherAssets = otherAssets;
    }

    public long getDeferredLongTermAssetCharges() {
        return deferredLongTermAssetCharges;
    }

    public void setDeferredLongTermAssetCharges(long deferredLongTermAssetCharges) {
        this.deferredLongTermAssetCharges = deferredLongTermAssetCharges;
    }

    public long getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(long totalAssets) {
        this.totalAssets = totalAssets;
    }

    public long getAccountsPayable() {
        return accountsPayable;
    }

    public void setAccountsPayable(long accountsPayable) {
        this.accountsPayable = accountsPayable;
    }

    public long getShortLongTermDebt() {
        return shortLongTermDebt;
    }

    public void setShortLongTermDebt(long shortLongTermDebt) {
        this.shortLongTermDebt = shortLongTermDebt;
    }

    public long getOtherCurrentLiab() {
        return otherCurrentLiab;
    }

    public void setOtherCurrentLiab(long otherCurrentLiab) {
        this.otherCurrentLiab = otherCurrentLiab;
    }

    public long getLongTermDebt() {
        return longTermDebt;
    }

    public void setLongTermDebt(long longTermDebt) {
        this.longTermDebt = longTermDebt;
    }

    public long getOtherLiab() {
        return otherLiab;
    }

    public void setOtherLiab(long otherLiab) {
        this.otherLiab = otherLiab;
    }

    public int getMinorityInterest() {
        return minorityInterest;
    }

    public void setMinorityInterest(int minorityInterest) {
        this.minorityInterest = minorityInterest;
    }

    public long getTotalCurrentLiabilities() {
        return totalCurrentLiabilities;
    }

    public void setTotalCurrentLiabilities(long totalCurrentLiabilities) {
        this.totalCurrentLiabilities = totalCurrentLiabilities;
    }

    public long getTotalLiab() {
        return totalLiab;
    }

    public void setTotalLiab(long totalLiab) {
        this.totalLiab = totalLiab;
    }

    public long getCommonStock() {
        return commonStock;
    }

    public void setCommonStock(long commonStock) {
        this.commonStock = commonStock;
    }

    public long getRetainedEarnings() {
        return retainedEarnings;
    }

    public void setRetainedEarnings(long retainedEarnings) {
        this.retainedEarnings = retainedEarnings;
    }

    public long getTreasuryStock() {
        return treasuryStock;
    }

    public void setTreasuryStock(long treasuryStock) {
        this.treasuryStock = treasuryStock;
    }

    public long getOtherStockholderEquity() {
        return otherStockholderEquity;
    }

    public void setOtherStockholderEquity(long otherStockholderEquity) {
        this.otherStockholderEquity = otherStockholderEquity;
    }

    public long getTotalStockholderEquity() {
        return totalStockholderEquity;
    }

    public void setTotalStockholderEquity(long totalStockholderEquity) {
        this.totalStockholderEquity = totalStockholderEquity;
    }

    public long getNetTangibleAssets() {
        return netTangibleAssets;
    }

    public void setNetTangibleAssets(long netTangibleAssets) {
        this.netTangibleAssets = netTangibleAssets;
    }
}
