package com.fraud.fraud.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@Data
@Entity
public class FraudCheckHistory {


    @Id
    @SequenceGenerator(name = "fraud_id_sequence",
    sequenceName ="fraud_id_sequence" )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator ="fraud_id_sequence" )
    private Integer id;
    private Integer customerId;
    private  Boolean isFraudster;
    private LocalDate createAt;

}
