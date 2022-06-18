package com.money.exchangerate.service;

import com.money.exchangerate.dto.converter.CurrencyDtoConverter;
import com.money.exchangerate.entity.Currency;
import com.money.exchangerate.repository.CurrencyRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CurrencyService {

    private final CurrencyRepository currencyRepository;
    private final CurrencyDtoConverter currencyDtoConverter;
    private final RestTemplate restTemplate = new RestTemplate();

    public CurrencyService(CurrencyRepository currencyRepository, CurrencyDtoConverter currencyDtoConverter) {
        this.currencyRepository = currencyRepository;
        this.currencyDtoConverter = currencyDtoConverter;
    }

/*    public CurrencyDto addCurrency(CurrencyDto currencyDto) {
        Currency currency = Currency.builder().build();
        return CurrencyDto.builder()
                .source(currencyDto.getSource())
                .date(LocalDateTime.now())
                .name(currencyDto.getName())
                .buyingPrice(currencyDto.getBuyingPrice())
                .sellingPrice(currencyDto.getSellingPrice())
                .build();
    }*/

    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }

    public Currency add(Currency currency) {
        return currencyRepository.save(currency);

    }

    public Object getCurrency() {
        return restTemplate.getForObject("https://evds2.tcmb.gov.tr/service/evds/"
                +"series=TP.DK.USD.A-TP.DK.EUR.A&startDate=01-06-2022&endDate=01-06-2022&type=json&key=3iscFMlsIy"
                , List.class);
    }

}
