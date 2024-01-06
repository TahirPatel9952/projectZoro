package com.my.fl.startup.controller;

import org.springframework.web.bind.annotation.*;
import com.my.fl.startup.entity.AddCab;
import com.my.fl.startup.repo.CabRepo;
import com.my.fl.startup.service.CabService;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.my.fl.startup.model.CabModel;

@RestController
@RequestMapping("/api/cab/")
public class CabController {
	
	@Autowired
	CabService cabService;
	
	@PostMapping("add-cab")
	public ResponseEntity<?> addCab(@RequestBody CabModel request){
		String response = this.cabService.addCab(request);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@PostMapping("update-cab")
	public ResponseEntity<?> updateCab(@RequestBody CabModel request){
		String response = this.cabService.addCab(request);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}
