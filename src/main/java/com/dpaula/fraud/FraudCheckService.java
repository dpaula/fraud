package com.dpaula.fraud;

import com.dpaula.fraud.repository.FraudCheckHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author Fernando de Lima on 29/07/22
 */
@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository repository;

    public Boolean checkFraud(Integer customerId) {
        FraudCheckHistory history = FraudCheckHistory.builder()
                .customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build();
        repository.save(history);
        return false;
    }
}
