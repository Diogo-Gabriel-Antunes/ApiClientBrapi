package org.example.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class BalanceSheetHistory {
    private ArrayList<BalanceSheetStatement> balanceSheetStatements;
}

