package org.example.DTO;



import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;



@JsonSerialize
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

    public ArrayList<Index> getIndexes() {
        return indexes;
    }

    public void setIndexes(ArrayList<Index> indexes) {
        this.indexes = indexes;
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public ArrayList<String> getAvailableSectors() {
        return availableSectors;
    }

    public void setAvailableSectors(ArrayList<String> availableSectors) {
        this.availableSectors = availableSectors;
    }

    public ArrayList<String> getAvailableStockTypes() {
        return availableStockTypes;
    }

    public void setAvailableStockTypes(ArrayList<String> availableStockTypes) {
        this.availableStockTypes = availableStockTypes;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }
}



