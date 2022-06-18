package com.money.exchangerate.controller;

import com.money.exchangerate.dto.CurrencyDto;
import com.money.exchangerate.dto.converter.CurrencyDtoConverter;
import com.money.exchangerate.entity.Currency;
import com.money.exchangerate.repository.CurrencyRepository;
import com.money.exchangerate.service.CurrencyService;
import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/currency")
public class CurrencyController {

    private final CurrencyRepository currencyRepository;
    private final CurrencyService currencyService;
    private final CurrencyDtoConverter currencyDtoConverter;


    public CurrencyController(CurrencyRepository currencyRepository,
                              CurrencyService currencyService,
                              CurrencyDtoConverter currencyDtoConverter) {
        this.currencyRepository = currencyRepository;
        this.currencyService = currencyService;
        this.currencyDtoConverter = currencyDtoConverter;
    }

/*    @PostMapping("/add")
    public ResponseEntity<CurrencyDto> addCurrency(@RequestBody CurrencyDto currencyDto) {
        return ResponseEntity.ok(currencyService.addCurrency(currencyDto));
    }*/

    @GetMapping("/all")
    public ResponseEntity<List<Currency>> getAllCurrencies() {
        return ResponseEntity.ok(currencyService.getAllCurrencies());
    }
    @PostMapping
    public ResponseEntity<Currency> add(@RequestBody Currency currency) {
        return ResponseEntity.ok(currencyService.add(currency));
    }
    @Value("${api.key}")
    private String apiKey;
    // https://evds2.tcmb.gov.tr/service/evds/series=TP.DK.USD.A-TP.DK.EUR.A&startDate=01-06-2022&endDate=01-06-2022&type=json&key=*****

    @Value("${access.key}")
    private String accessKey;
    //https://api.currencylayer.com/live?access_key=*****

    @GetMapping("/currency")
    public List<Currency> getCurrency() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://evds2.tcmb.gov.tr/service/evds/"
                +"series=TP.DK.USD.A-TP.DK.EUR.A&startDate=10-05-2022&endDate=12-05-2022&"
                +"type=json&key=" + apiKey;
        Currency currencies = restTemplate.getForObject(url, Currency.class);
        return Arrays.asList(currencies);
    }

    //Get From TCMB
    @GetMapping("/object")
    public Object getObject() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://evds2.tcmb.gov.tr/service/evds/"
                +"series=TP.DK.USD.A-TP.DK.EUR.A&startDate=10-05-2022&endDate=12-05-2022&"
                +"type=json&key=" + apiKey;
        Object currencies = restTemplate.getForObject(url, Object.class);
        return currencies;
    }




}
