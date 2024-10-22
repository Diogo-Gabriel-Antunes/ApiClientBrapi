package org.example.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;




@JsonSerialize
public class BalanceSheetHistory {
    private ArrayList<BalanceSheetStatement> balanceSheetStatements;

    public ArrayList<BalanceSheetStatement> getBalanceSheetStatements() {
        return balanceSheetStatements;
    }

    public void setBalanceSheetStatements(ArrayList<BalanceSheetStatement> balanceSheetStatements) {
        this.balanceSheetStatements = balanceSheetStatements;
    }
}

