package com.ravi.springboot.microservice.example.forex.forexservice.repository;

import com.ravi.springboot.microservice.example.forex.forexservice.entity.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends
        JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
