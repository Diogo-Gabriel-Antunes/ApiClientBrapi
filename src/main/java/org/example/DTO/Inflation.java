package org.example.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Inflation {
    private String date;
    private String value;
    private Object epochDate;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Object getEpochDate() {
        return epochDate;
    }

    public void setEpochDate(Object epochDate) {
        this.epochDate = epochDate;
    }
}

