package com.money.exchangerate.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Currency {

    @Id
    private long id;
    private String source;
    @JsonProperty("Tarih")
    private LocalDateTime date;
    private String name;
    @JsonProperty("P_DK_USD_A")
    private double usdPrice;
    @JsonProperty("P_DK_EUR_A")
    private double eurPrice;

}
