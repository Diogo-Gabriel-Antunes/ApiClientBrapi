package org.example.DTO;


import java.util.Date;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
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

    public String getAssetIssued() {
        return assetIssued;
    }

    public void setAssetIssued(String assetIssued) {
        this.assetIssued = assetIssued;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getRelatedTo() {
        return relatedTo;
    }

    public void setRelatedTo(String relatedTo) {
        this.relatedTo = relatedTo;
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
