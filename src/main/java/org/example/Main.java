package org.example;

import com.google.gson.Gson;
import org.example.Client.ActiveClient;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var client = new ActiveClient();

        var gson = new Gson();
        var result = client.getTicketQuote(new ArrayList<>(){{
            add("PETR4");
        }},null,null,new ArrayList<>(){{
            add("summaryProfile");
        }},null,null,null,null);
        var json = gson.toJson(result);

        System.out.println(json);
    }
}