package org.example.Client;

import org.example.DTO.PrimeRate;
import org.example.DTO.ResponsePrimeRateAvailable;

import java.util.HashMap;
import java.util.List;

public class TaxFeesClient {

    public List<PrimeRate> getPrimeRate(String country,String start,String end,String sortBy,String sortOrder){
        EndPointBuilder builder = EndPointBuilder.create("/v2/prime-rate");

        if(country != null && country.isEmpty()){
            builder.addParam("country="+country);
        }
        if(start != null && start.isEmpty()){
            builder.addParam("start="+start);
        }
        if(end != null && end.isEmpty()){
            builder.addParam("end="+end);
        }
        if(sortBy != null && sortBy.isEmpty()){
            builder.addParam("sortBy="+sortBy);
        }
        if(sortOrder != null && sortOrder.isEmpty()){
            builder.addParam("sortOrder="+sortOrder);
        }

        return (List<PrimeRate>) ApiClient.send(builder,HashMap.class).get("prime-rate");
    }

    public ResponsePrimeRateAvailable getPrimeRateAvailable(String search){
        EndPointBuilder builder = EndPointBuilder.create("/v2/prime-rate/available");

        if(search != null && search.isEmpty()){
            builder.addParam("search="+search);
        }

        return ApiClient.send(builder,ResponsePrimeRateAvailable.class);
    }
}
