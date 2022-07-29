package com.dpaula.fraud.repository;

import com.dpaula.fraud.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Fernando de Lima on 29/07/22
 */
public interface FraudCheckHistoryRepository extends JpaRepository<FraudCheckHistory, Integer> {

}
