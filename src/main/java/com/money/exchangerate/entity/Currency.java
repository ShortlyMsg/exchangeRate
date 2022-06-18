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
    private LocalDateTime date;
    private String name;
    private double buyingPrice;
    private double sellingPrice;

}
