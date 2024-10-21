package org.example.DTO;

import lombok.Data;

import java.util.List;

@Data
public class ResponseCoinAvailable {

    private List<String> coins;
}
