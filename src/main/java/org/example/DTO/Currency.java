package org.example.DTO;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class Currency{
    private String name;
    private String currency;
    private String fromCurrency;
    private String toCurrency;
    private String high;
    private String low;
    private String bidVariation;
    private String percentageChange;
    private String bidPrice;
    private String askPrice;
    private String updatedAtTimestamp;
    private String updatedAtDate;
}
