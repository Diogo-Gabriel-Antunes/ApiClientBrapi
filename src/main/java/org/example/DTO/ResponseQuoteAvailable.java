package org.example.DTO;

import lombok.Data;

import java.util.List;

@Data
public class ResponseQuoteAvailable {
    private List<String> indexes;
    private List<String> stocks;
}
