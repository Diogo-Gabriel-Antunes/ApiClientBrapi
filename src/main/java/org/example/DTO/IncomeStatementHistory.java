package org.example.DTO;

import lombok.Data;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
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
}
