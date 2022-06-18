package com.money.exchangerate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CurrencyDto {
    private String source;
    private LocalDateTime date;
    private String name;
    private double buyingPrice;
    private double sellingPrice;
}
