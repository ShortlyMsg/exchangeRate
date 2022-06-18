package com.money.exchangerate.dto.converter;

import com.money.exchangerate.dto.CurrencyDto;
import com.money.exchangerate.entity.Currency;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CurrencyDtoConverter {

    /*public CurrencyDto convertToCurrencyDto(Currency currency){
        return CurrencyDto.builder()
                .source(currency.getSource())
                .date(LocalDateTime.now())
                .name(currency.getName())
                .buyingPrice(currency.getBuyingPrice())
                .sellingPrice(currency.getSellingPrice())
                .build();
    }
    public CurrencyDto convertToCurrencyDto2(Currency currency){
        return new CurrencyDto(
                currency.getSource(),
                LocalDateTime.now(),
                currency.getName(),
                currency.getBuyingPrice(),
                currency.getSellingPrice()
        );

    }*/

    /*public List<CurrencyDto> convertToCurrencyDto(List<Currency> currency){
        return currency.stream()
                .map(this::convertToCurrencyDto)
                .collect(Collectors.toList());
    }*/

}
