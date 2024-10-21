package org.example.DTO.Enum;

public enum Sector {
    RETAILTRADE("Retail Trade"),ENERGYMINERALS("Energy Minerals"),HEALTHSERVICES("Health Services"),UTILITIES("Utilities"),FINANCE("Finance"),
    CONSUMERSERVICES("Consumer Services"),CONSUMERNONDURABLES("Consumer Non-Durables"),NONENERGYMINERALS("Non-Energy Minerals"),
    COMMERCIALSERVICES("Commercial Services"),DISTRIBUTIONSERVICES("Distribution Services"),TRANSPORTATION("Transportation"),
    TECHNOLOGYSERVICES("Technology Services"),PROCESSINDUSTRIES("Process Industries"),COMMUNICATIONS("Communications"),
    PRODUCERMANUFACTURING("Producer Manufacturing"),NULL("null"),MISCELLANEOUS("Miscellaneous"),ELETRONICTECHNOLOGY("Electronic Technology"),INDUSTRIALSERVICE("Industrial Services"),
    HEALTHTECHNOLOGY("Health Technology"),CONSUMERDURABLES("Consumer Durables");

    public String sector;

    Sector(String sector) {
        this.sector = sector;
    }
}
