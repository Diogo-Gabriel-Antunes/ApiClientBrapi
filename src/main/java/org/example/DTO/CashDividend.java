package org.example.DTO;


import java.util.Date;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
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
