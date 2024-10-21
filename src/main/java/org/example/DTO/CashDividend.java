package org.example.DTO;

import lombok.Data;

import java.util.Date;


@Data
public class CashDividend{
    private String assetIssued;
    private Date paymentDate;
    private double rate;
    private String relatedTo;
    private Date approvedOn;
    private String isinCode;
    private String label;
    private Date lastDatePrior;
    private String remarks;
}
