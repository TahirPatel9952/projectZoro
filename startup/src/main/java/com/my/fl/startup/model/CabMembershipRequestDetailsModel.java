package com.my.fl.startup.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CabMembershipRequestDetailsModel {

    private Long id;
    private String planDuration;
    private String planExpiryDate;
    private Long membershipPlanId;
    private String membershipRequestId;
    private Long addCabId;

}

