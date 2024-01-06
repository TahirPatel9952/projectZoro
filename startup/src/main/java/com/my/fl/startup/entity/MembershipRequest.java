package com.my.fl.startup.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "membershp_request")
@Getter
@Setter
public class MembershipRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    @Column(name = "transaction_no")
    private String transactionNo;

    @Column(name = "phonePayNumber")
    private String phonePayNumber;

    @Column(name = "totalAmount")
    private String totalAmount;

    @Column(name = "purchase_date")
    private String purchaseDate;

    @Column(name = "updated_date")
    private String updatedDate;

}

