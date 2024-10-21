package org.example.DTO.Enum;


public enum Type {
    STOCK("stock"),FUND("fund"),BDR("bdr");

    public String type;

    Type(String type) {
        this.type = type;
    }
}
