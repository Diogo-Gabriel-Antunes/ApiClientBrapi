package org.example.DTO;

import lombok.Data;

import java.util.ArrayList;

@Data
public class SummaryProfile {
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String website;
    private String industry;
    private String industryKey;
    private String industryDisp;
    private String sector;
    private String sectorKey;
    private String sectorDisp;
    private String longBusinessSummary;
    private int fullTimeEmployees;
    private ArrayList<Object> companyOfficers;
}
