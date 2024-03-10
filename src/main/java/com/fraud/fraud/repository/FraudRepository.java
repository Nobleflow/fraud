package com.fraud.fraud.repository;


import com.fraud.fraud.model.FraudCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudRepository extends JpaRepository<FraudCheckHistory,Integer> {
}
