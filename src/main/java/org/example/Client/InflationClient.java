package org.example.Client;


import org.example.DTO.ResponseInflation;
import org.example.DTO.ResponseInflationAvaible;

public class InflationClient {

    public ResponseInflation getInflation(String country ,String start ,String end ,String sortBy ,String sortOrder) {
        EndPointBuilder endPoint = EndPointBuilder.create("/v2/inflation");

        if (country != null && !country.isEmpty()) {
            endPoint.addParam("country=" + country);
        }

        if (start != null && !start.isEmpty()) {
            endPoint.addParam("start=" + start);
        }
        if (end != null && !end.isEmpty()) {
            endPoint.addParam("end=" + end);
        }
        if (sortBy != null && !sortBy.isEmpty()) {
            endPoint.addParam("sortBy=" + sortBy);
        }

        if (sortOrder != null && !sortOrder.isEmpty()) {
            endPoint.addParam("sortOrder=" + sortOrder);
        }

        return ApiClient.send(endPoint ,ResponseInflation.class);
    }


    public ResponseInflationAvaible getInflation(String search) {
        EndPointBuilder endPoint = EndPointBuilder.create("/v2/inflation/available");

        if (search != null && !search.isEmpty()) {
            endPoint.addParam("search=" + search);
        }

        return ApiClient.send(endPoint ,ResponseInflationAvaible.class);
    }
}
