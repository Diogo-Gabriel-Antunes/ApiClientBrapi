package org.example.DTO;


import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class ResponseInflation {
    private ArrayList<Inflation> inflation;
}

