package com.dpaula.fraud.controller;

import com.dpaula.fraud.FraudCheckService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author Fernando de Lima on 29/07/22
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fraud-check")
public class FraudController {

    private final FraudCheckService service;

    @GetMapping("{customerId}")
    public FraudCheckResponse checkFraud(@PathVariable("customerId") Integer customerId){

        final var isFraudster = service.checkFraud(customerId);

        log.info("Checking fraud for customer: {}", customerId);

        return new FraudCheckResponse(isFraudster);
    }
}
