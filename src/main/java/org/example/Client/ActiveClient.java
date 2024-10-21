package org.example.Client;


import com.google.gson.Gson;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.example.DTO.Enum.Sector;
import org.example.DTO.Enum.Type;
import org.example.DTO.Enum.TypeInterval;
import org.example.DTO.ResponseQuote;
import org.example.DTO.ResponseQuoteAvailable;
import org.example.DTO.ResponseQuoteList;

import java.net.http.HttpResponse;
import java.util.List;

public class ActiveClient {

    public ResponseQuote getTicketQuote(List<String> tickers ,Boolean dividends ,Boolean fundamental ,List<String> modules ,Integer range ,Integer interval ,TypeInterval rangeType ,TypeInterval intervalType) {
        EndPointBuilder builder = EndPointBuilder.create("/quote/" + tickers.toString().replace("[" ,"").replace("]" ,""));
        ResponseQuote responseQuote = null;
        if (BooleanUtils.isTrue(dividends)) {
            builder.addParam("dividends=true");
        } else {
            builder.addParam("dividends=false");
        }

        if (BooleanUtils.isTrue(fundamental)) {
            builder.addParam("fundamental=true");
        } else {
            builder.addParam("fundamental=false");
        }

        if (ArrayUtils.isNotEmpty(modules.toArray())) {
            addModulesToParam(modules ,builder);
        }

        if (range != null) {
            if (rangeType == null) {
                throw new RuntimeException("É necessario passar um tipo de range");
            }
            builder.addParam(range + rangeType.interval);
        }

        if (interval != null) {
            if (intervalType == null) {
                throw new RuntimeException("É necessario passar um tipo de intervalo");
            }
            builder.addParam(interval + intervalType.interval);
        }

        return ApiClient.send(builder ,ResponseQuote.class);
    }

    public ResponseQuoteList getQuoteList(String search ,String sortBy ,String sortOrder ,Integer limit ,Integer page ,Type type ,Sector sector) {
        EndPointBuilder builder = EndPointBuilder.create("/quote/list");

        if (search != null && !StringUtils.isEmpty(search)) {
            builder.addParam("search=" + search);
        }

        if (sortBy != null && !StringUtils.isEmpty(sortBy)) {
            builder.addParam("sortBy=" + sortBy);
        }

        if (sortOrder != null && !StringUtils.isEmpty(sortOrder)) {
            builder.addParam("sortOrder=" + sortOrder);
        }

        if (limit != null) {
            builder.addParam("limit=" + limit);
        }

        if (page != null) {
            builder.addParam("page=" + page);
        }

        if (type != null) {
            builder.addParam("type=" + type.type);
        }

        if (sector != null) {
            builder.addParam("sector=" + sector.sector);
        }

        return ApiClient.send(builder ,ResponseQuoteList.class);
    }

    public ResponseQuoteAvailable GetAvaible(String search) {
        EndPointBuilder endPoint = EndPointBuilder.create("/available");
        if (search != null) {
            endPoint.addParam("search=" + search);
        }

        return ApiClient.send(endPoint,ResponseQuoteAvailable.class);
    }

    private void addModulesToParam(List<String> modules ,EndPointBuilder builder) {
        StringBuilder modulesParam = new StringBuilder().append("modules=");
        modules.forEach(s -> {
            modulesParam.append(s)
                    .append(",");
        });
        var index = modulesParam.lastIndexOf(",");
        modulesParam.deleteCharAt(index);
        builder.addParam(modulesParam.toString());
    }
}
