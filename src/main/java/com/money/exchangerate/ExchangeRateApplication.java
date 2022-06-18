package com.money.exchangerate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ExchangeRateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExchangeRateApplication.class, args);
    }

    //   3iscFMlsIy    - api key
    // https://evds2.tcmb.gov.tr/service/evds/series=TP.DK.USD.A-TP.DK.EUR.A&startDate=01-06-2022&endDate=03-06-2022&type=json&key=3iscFMlsIy

    /*URI uri = URI.create("http://www.tcmb.gov.tr/kurlar/today.xml");*/

    // 13qUaoGrYwsqmFIlECRMwI3xdeiQRNIi
}
