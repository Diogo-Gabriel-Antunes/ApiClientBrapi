package org.example.DTO.Enum;


public enum TypeInterval {
    M("m"),H("h"),D("d"),WK("wk"),MO("mo");

    public String interval;

    TypeInterval(String interval) {
        this.interval = interval;
    }
}
