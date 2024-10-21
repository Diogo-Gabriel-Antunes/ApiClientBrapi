package org.example.DTO;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class ResponseCoin {
    private ArrayList<Currency> currency;
}


