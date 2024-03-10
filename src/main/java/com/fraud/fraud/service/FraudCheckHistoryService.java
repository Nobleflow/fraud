package com.fraud.fraud.service;

import com.fraud.fraud.model.FraudCheckHistory;
import com.fraud.fraud.repository.FraudRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class FraudCheckHistoryService {

    private final FraudRepository fraudRepository;

    public FraudCheckHistoryService(FraudRepository fraudRepository) {
        this.fraudRepository = fraudRepository;
    }
    public Boolean  isFraudulentCustomer(Integer customerID){
        fraudRepository.save(FraudCheckHistory.builder().customerId(customerID).
                createAt(LocalDate.now()).isFraudster(false).build());
        return  false;
    }
}
