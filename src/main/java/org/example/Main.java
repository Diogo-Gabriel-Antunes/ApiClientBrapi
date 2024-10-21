package org.example;

import com.google.gson.Gson;
import org.example.Client.ActiveClient;
import org.example.DTO.Enum.Type;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var client = new ActiveClient();

        var gson = new Gson();

        var result = client.getQuoteList(null,null,null,10,1,Type.BDR,null);
        var json = gson.toJson(result);

        System.out.println(json);
    }
}