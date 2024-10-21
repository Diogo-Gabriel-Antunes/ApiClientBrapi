package org.example.DTO;


import lombok.Data;

import java.util.ArrayList;

@Data
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



