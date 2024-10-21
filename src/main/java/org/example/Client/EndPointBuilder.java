package org.example.Client;

import lombok.Data;

import java.util.ArrayList;

@Data
public class EndPointBuilder {

    private StringBuilder endPoint = new StringBuilder();
    private ArrayList<String> queryParams = new ArrayList<>();

    public static EndPointBuilder create(String endPoint){
       var endBuilder = new EndPointBuilder();
       endBuilder.endPoint.append(endPoint);
       return endBuilder;
    }

    public EndPointBuilder addParam(String param){
        if(this.queryParams.isEmpty()){
            this.endPoint.append("?")
                    .append(param);
            this.queryParams.add(param);
        }else{
            this.endPoint.append("&")
                    .append(param);
            this.queryParams.add(param);
        }
        return this;
    }

    public String getEndPoint(){
        return this.endPoint.toString();
    }
}
