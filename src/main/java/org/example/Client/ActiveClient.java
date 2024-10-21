package org.example.Client;


import com.google.gson.Gson;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.example.DTO.Enum.TypeInterval;
import org.example.DTO.ResponseQuote;
import org.example.DTO.ResultQuote;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class ActiveClient {

    public ArrayList<ResultQuote> getTicketQuote(List<String> tickers ,Boolean dividends ,Boolean fundamental ,List<String> modules ,Integer range ,Integer interval ,TypeInterval rangeType ,TypeInterval intervalType) {
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

        var client = new ApiClient(builder.getEndPoint());
        try {
            HttpResponse<String> response = client.getClient().send(client.getRequest() ,HttpResponse.BodyHandlers.ofString());
            client.verifyStatusCode(response);
            var gson = new Gson();
            responseQuote = gson.fromJson(response.body() ,ResponseQuote.class);
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        } catch (Throwable ex) {
            throw new RuntimeException("Erro indefinido na requisição");
        }
        return responseQuote.getResults();
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
