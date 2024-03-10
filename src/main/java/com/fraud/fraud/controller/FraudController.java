package com.fraud.fraud.controller;



import com.fraud.fraud.model.FraudCheckHistory;
import com.fraud.fraud.request.FraudCheckReponse;
import com.fraud.fraud.service.FraudCheckHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/fraud-check")
public class FraudController {

    private  final FraudCheckHistoryService fraudCheckHistoryService;

    public FraudController(FraudCheckHistoryService fraudCheckHistoryService) {
        this.fraudCheckHistoryService = fraudCheckHistoryService;
    }

    @GetMapping(path = "{customerId}")
    public FraudCheckReponse isFraudster(@PathVariable("customerId") Integer  customerId){
        log.info("enregistrement de votre customer"+customerId);
        Boolean isFraudlentCustomer =fraudCheckHistoryService.isFraudulentCustomer(customerId);
     return  new FraudCheckReponse(isFraudlentCustomer);
    }

}
