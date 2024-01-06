package com.my.fl.startup.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "add_cab")
@Getter
@Setter
public class AddCab {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CAB_SEQ_ID")
    private Long id;
	
	@Column(name = "CAB_REG_NO")
	private String cabRegNo;
	
	@Column(name = "CAB_BRAND")
	private String cabBrand;
	
	@Column(name = "CAB_MODEL")
	private String cabModel;
	
	@Column(name = "MODEL_YEAR")
	private String modelYear;
	
	@Column(name = "CURRENT_MILEAGE")
	private String cabMileage;
	
	@Column(name = "FUEL_TYPE")
	private String fuelType;
	
	@Column(name = "BODY_TYPE")
	private String bodyType;
	
	@Column(name = "TRANSMISSION")
	private String transmission;
	
	@Column(name = "KM_DRIVEN")
	private String kmDriven;
	
	@Column(name = "NO_OF_PASSENGER")
	private String noOfPassenger;
	
	@Column(name = "COLOR")
	private String color;
	
	@Column(name = "INSURENCE_COMP_NAME")
	private String insurenceCompName;
	
	@Column(name = "CERTIFIED_COMP_NAME")
	private String certifiedCompName;
	
	@Column(name = "REGISTERED_YEAR")
	private String registeredYear;
	
	@Column(name = "REGISTERED_CITY")
	private String registeredCity;
	
	@Column(name = "REGISTERED_STATE")
	private String registeredState;
	
    @Lob
    @Column(name = "RC_DOC")
    private byte[] rcDoc;

    @Lob
    @Column(name = "INSURANCE_DOC")
    private byte[] insuranceDoc;

    @Lob
    @Column(name = "CAB_PHOTO")
    private byte[] cabPhoto;

    @Column(name = "CAB_OWNER_ID")
    private String cabOwnerId;

    @Column(name = "CAB_GEN_ID")
    private String cabGenId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "MOBILE_NO")
    private String mobileNo;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "PINCODE")
    private String pincode;

    @Column(name = "CAB_ADDED_DATE")
    private String cabAddedDate;

    @Column(name = "CAB_PLATE_STATUS")
    private String cabPlateStatus;

    @Column(name = "CAB_EXPIRY_DATE")
    private String cabExpiryDate;

    @Column(name = "CAB_VALID_DAYS")
    private String cabValidDays;
    
    

}
