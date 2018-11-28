package com.paytm.thriftDemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostpaidAccountDTO {

    private String firstName;
    private Integer customerId;
    private Double dueAmount;
}
