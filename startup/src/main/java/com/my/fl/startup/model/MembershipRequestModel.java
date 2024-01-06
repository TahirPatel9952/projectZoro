package com.my.fl.startup.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MembershipRequestModel {

    private Long id;
    private String status;
    private String transactionNo;
    private String phonePayNumber;
    private String totalAmount;
    private String purchaseDate;
    private String updatedDate;

}

