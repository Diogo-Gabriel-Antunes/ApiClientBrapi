package org.example.DTO;// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.Date;



@JsonSerialize
public class ResponseQuote {
    private ArrayList<ResultQuote> results;
    private Date requestedAt;
    private String took;

    public ArrayList<ResultQuote> getResults() {
        return results;
    }

    public void setResults(ArrayList<ResultQuote> results) {
        this.results = results;
    }

    public Date getRequestedAt() {
        return requestedAt;
    }

    public void setRequestedAt(Date requestedAt) {
        this.requestedAt = requestedAt;
    }

    public String getTook() {
        return took;
    }

    public void setTook(String took) {
        this.took = took;
    }
}



