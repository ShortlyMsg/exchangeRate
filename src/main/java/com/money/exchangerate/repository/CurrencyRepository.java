package com.money.exchangerate.repository;

import com.money.exchangerate.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    //Optional<Currency> findByAccessKey(String accessKey);

}
