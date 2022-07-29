package com.dpaula.fraud.controller;

import com.dpaula.fraud.FraudCheckService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fernando de Lima on 29/07/22
 */
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/fraud-check")
public class FraudController {

    private final FraudCheckService service;

    @PostMapping("{customerId}")
    public FraudCheckResponse checkFraud(@PathVariable("customerId") Integer customerId){

        final var isFraudster = service.checkFraud(customerId);

        return new FraudCheckResponse(isFraudster);
    }
}
