package com.my.fl.startup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.fl.startup.entity.AddCab;
import com.my.fl.startup.repo.CabRepo;
import com.my.fl.startup.model.CabModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.my.fl.startup.repo.MembershipPlanRepo;
import com.my.fl.startup.entity.MembershipPlan;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class CabService {
	
	@Autowired
	CabRepo cabRepo;
	
	@Autowired
    ObjectMapper objectMapper;
	
	@Autowired
	MembershipPlanRepo membershipPlanRepo;
	
	public String addCab(CabModel request) {
        try {
        	AddCab cabEntity = objectMapper.convertValue(request, AddCab.class);
        	String random = String.valueOf(((int) (Math.random() * (1000000 - 100000))) + 100000);
        	cabEntity.setCabGenId("Z"+random);
        	cabEntity.setStatus("inactive");
        	cabRepo.save(cabEntity);
        }catch (Exception ex) {
        	ex.printStackTrace();
        }
        return "Cab Added Successfully";
   }
	
	public String updateCab(CabModel request) {
        try {
        	MembershipPlan membershipPlan = membershipPlanRepo.findById(request.getMemberShipPlanId()).get();
        	
        	if(membershipPlan != null) {
        		int durationInDays = Integer.parseInt(membershipPlan.getDuration());
        		
        		LocalDate localCurrentDate = LocalDate.now();
        		LocalDate expiryDate = localCurrentDate.plusDays(durationInDays);
        		
        		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//                String formattedCurrentDate = localCurrentDate.format(formatter);
                String formattedExpiryDate = expiryDate.format(formatter);
                
                AddCab cabEntity = cabRepo.findById(request.getCabSeqId().intValue()).get();
                cabEntity.setCabExpiryDate(formattedExpiryDate);
                cabEntity.setStatus("active");
                
                cabRepo.save(cabEntity);
        	}
        	
        }catch (Exception ex) {
        	ex.printStackTrace();
        }
        return "Cab Added Successfully";
   }

}
