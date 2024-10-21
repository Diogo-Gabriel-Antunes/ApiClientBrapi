package org.example.DTO;


import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
@Builder
public class ResponseCryptoAvailable {
    private List<String> coins;
}
