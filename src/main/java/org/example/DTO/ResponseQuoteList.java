package org.example.DTO;



import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class ResponseQuoteList{
    private ArrayList<Index> indexes;
    private ArrayList<Stock> stocks;
    private ArrayList<String> availableSectors;
    private ArrayList<String> availableStockTypes;
    private int currentPage;
    private int totalPages;
    private int itemsPerPage;
    private int totalCount;
    private boolean hasNextPage;
}



