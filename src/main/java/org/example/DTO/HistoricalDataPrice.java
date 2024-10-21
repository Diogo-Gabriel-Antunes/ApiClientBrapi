package org.example.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class HistoricalDataPrice{
    private int date;
    private double myopen;
    private double high;
    private double low;
    private double close;
    private int volume;
    private double adjustedClose;
}
