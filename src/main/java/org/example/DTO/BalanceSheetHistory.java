package org.example.DTO;

import lombok.Data;

import java.util.ArrayList;

@Data
public class BalanceSheetHistory{
    private ArrayList<BalanceSheetStatement> balanceSheetStatements;
}

