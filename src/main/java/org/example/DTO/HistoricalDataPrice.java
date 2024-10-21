package org.example.DTO;

import lombok.Data;

@Data
public class HistoricalDataPrice{
    private int date;
    private double myopen;
    private double high;
    private double low;
    private double close;
    private int volume;
    private double adjustedClose;
}
