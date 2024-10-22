package org.example.DTO;


import java.util.Date;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;



@JsonSerialize
public class StockDividend{
    private String assetIssued;
    private double factor;
    private String completeFactor;
    private Date approvedOn;
    private String isinCode;
    private String label;
    private Date lastDatePrior;
    private String remarks;

    public String getAssetIssued() {
        return assetIssued;
    }

    public void setAssetIssued(String assetIssued) {
        this.assetIssued = assetIssued;
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    public String getCompleteFactor() {
        return completeFactor;
    }

    public void setCompleteFactor(String completeFactor) {
        this.completeFactor = completeFactor;
    }

    public Date getApprovedOn() {
        return approvedOn;
    }

    public void setApprovedOn(Date approvedOn) {
        this.approvedOn = approvedOn;
    }

    public String getIsinCode() {
        return isinCode;
    }

    public void setIsinCode(String isinCode) {
        this.isinCode = isinCode;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Date getLastDatePrior() {
        return lastDatePrior;
    }

    public void setLastDatePrior(Date lastDatePrior) {
        this.lastDatePrior = lastDatePrior;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
