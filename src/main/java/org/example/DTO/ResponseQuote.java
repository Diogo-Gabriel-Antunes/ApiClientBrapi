package org.example.DTO;// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class ResponseQuote {
    private ArrayList<ResultQuote> results;
    private Date requestedAt;
    private String took;
}



