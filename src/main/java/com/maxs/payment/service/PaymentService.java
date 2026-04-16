package com.maxs.payment.service;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Map;

@Service
public class PaymentService {

    public Map<String, Object> getStatus() {
        return Map.of(
                "status", "UP",
                "service", "status-check-service",
                "timestamp", Instant.now().toString()
        );
    }
}
