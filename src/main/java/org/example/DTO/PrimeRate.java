package org.example.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class PrimeRate {
    private String date;
    private String value;
    private Object epochDate;
}
