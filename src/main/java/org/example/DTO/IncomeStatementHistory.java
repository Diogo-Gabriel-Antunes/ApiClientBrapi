package org.example.DTO;


import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class IncomeStatementHistory {
    private Date endDate;
    private long totalRevenue;
    private long costOfRevenue;
    private long grossProfit;
    private long researchDevelopment;
    private long sellingGeneralAdministrative;
    private Object nonRecurring;
    private int otherOperatingExpenses;
    private long totalOperatingExpenses;
    private long operatingIncome;
    private int totalOtherIncomeExpenseNet;
    private long ebit;
    private int interestExpense;
    private long incomeBeforeTax;
    private long incomeTaxExpense;
    private int minorityInterest;
    private long netIncomeFromContinuingOps;
    private Object discontinuedOperations;
    private Object extraordinaryItems;
    private Object effectOfAccountingCharges;
    private Object otherItems;
    private long netIncome;
    private long netIncomeApplicableToCommonShares;

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public long getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(long totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public long getCostOfRevenue() {
        return costOfRevenue;
    }

    public void setCostOfRevenue(long costOfRevenue) {
        this.costOfRevenue = costOfRevenue;
    }

    public long getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(long grossProfit) {
        this.grossProfit = grossProfit;
    }

    public long getResearchDevelopment() {
        return researchDevelopment;
    }

    public void setResearchDevelopment(long researchDevelopment) {
        this.researchDevelopment = researchDevelopment;
    }

    public long getSellingGeneralAdministrative() {
        return sellingGeneralAdministrative;
    }

    public void setSellingGeneralAdministrative(long sellingGeneralAdministrative) {
        this.sellingGeneralAdministrative = sellingGeneralAdministrative;
    }

    public Object getNonRecurring() {
        return nonRecurring;
    }

    public void setNonRecurring(Object nonRecurring) {
        this.nonRecurring = nonRecurring;
    }

    public int getOtherOperatingExpenses() {
        return otherOperatingExpenses;
    }

    public void setOtherOperatingExpenses(int otherOperatingExpenses) {
        this.otherOperatingExpenses = otherOperatingExpenses;
    }

    public long getTotalOperatingExpenses() {
        return totalOperatingExpenses;
    }

    public void setTotalOperatingExpenses(long totalOperatingExpenses) {
        this.totalOperatingExpenses = totalOperatingExpenses;
    }

    public long getOperatingIncome() {
        return operatingIncome;
    }

    public void setOperatingIncome(long operatingIncome) {
        this.operatingIncome = operatingIncome;
    }

    public int getTotalOtherIncomeExpenseNet() {
        return totalOtherIncomeExpenseNet;
    }

    public void setTotalOtherIncomeExpenseNet(int totalOtherIncomeExpenseNet) {
        this.totalOtherIncomeExpenseNet = totalOtherIncomeExpenseNet;
    }

    public long getEbit() {
        return ebit;
    }

    public void setEbit(long ebit) {
        this.ebit = ebit;
    }

    public int getInterestExpense() {
        return interestExpense;
    }

    public void setInterestExpense(int interestExpense) {
        this.interestExpense = interestExpense;
    }

    public long getIncomeBeforeTax() {
        return incomeBeforeTax;
    }

    public void setIncomeBeforeTax(long incomeBeforeTax) {
        this.incomeBeforeTax = incomeBeforeTax;
    }

    public long getIncomeTaxExpense() {
        return incomeTaxExpense;
    }

    public void setIncomeTaxExpense(long incomeTaxExpense) {
        this.incomeTaxExpense = incomeTaxExpense;
    }

    public int getMinorityInterest() {
        return minorityInterest;
    }

    public void setMinorityInterest(int minorityInterest) {
        this.minorityInterest = minorityInterest;
    }

    public long getNetIncomeFromContinuingOps() {
        return netIncomeFromContinuingOps;
    }

    public void setNetIncomeFromContinuingOps(long netIncomeFromContinuingOps) {
        this.netIncomeFromContinuingOps = netIncomeFromContinuingOps;
    }

    public Object getDiscontinuedOperations() {
        return discontinuedOperations;
    }

    public void setDiscontinuedOperations(Object discontinuedOperations) {
        this.discontinuedOperations = discontinuedOperations;
    }

    public Object getExtraordinaryItems() {
        return extraordinaryItems;
    }

    public void setExtraordinaryItems(Object extraordinaryItems) {
        this.extraordinaryItems = extraordinaryItems;
    }

    public Object getEffectOfAccountingCharges() {
        return effectOfAccountingCharges;
    }

    public void setEffectOfAccountingCharges(Object effectOfAccountingCharges) {
        this.effectOfAccountingCharges = effectOfAccountingCharges;
    }

    public Object getOtherItems() {
        return otherItems;
    }

    public void setOtherItems(Object otherItems) {
        this.otherItems = otherItems;
    }

    public long getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(long netIncome) {
        this.netIncome = netIncome;
    }

    public long getNetIncomeApplicableToCommonShares() {
        return netIncomeApplicableToCommonShares;
    }

    public void setNetIncomeApplicableToCommonShares(long netIncomeApplicableToCommonShares) {
        this.netIncomeApplicableToCommonShares = netIncomeApplicableToCommonShares;
    }
}
