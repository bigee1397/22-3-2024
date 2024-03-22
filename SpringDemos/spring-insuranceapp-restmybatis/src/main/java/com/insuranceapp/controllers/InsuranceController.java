package com.insuranceapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insuranceapp.model.Insurance;
import com.insuranceapp.service.IInsuranceService;

@RestController
@RequestMapping("/insurance-api/v1")
public class InsuranceController {

	@Autowired
	IInsuranceService insuranceService;
	
	@GetMapping("/")
	public String home() {
		return "Home";
	}
	
	@PostMapping("/insurances")
	ResponseEntity<Void> insertInsurance(@RequestBody Insurance insurance) {
		insuranceService.addInsurance(insurance);
		return ResponseEntity.status(HttpStatusCode.valueOf(201)).build();
	}
	
	@PutMapping("/insurances")
	ResponseEntity<Void> updateInsurance(@RequestBody Insurance insurance) {
		insuranceService.updateInsurance(insurance.getInsuranceId(), insurance.getPremium());
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).build();
	}
	
	@DeleteMapping("/insurances")
	ResponseEntity<Void> deleteInsurance(@PathVariable("insuranceId") int insuranceId) {
		insuranceService.deleteInsurance(insuranceId);
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).build();
	}
	
	@GetMapping("/insurances")
	ResponseEntity<List<Insurance>> listInsurances() {
		List<Insurance> insurances = insuranceService.getAll();
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "seding a list of all insurances");
		return ResponseEntity.status(200).headers(headers).body(insurances);
	}
	
	@GetMapping("/insurances/insurance-id/{insuranceId}")
	ResponseEntity<Insurance> getById(@RequestParam("insuranceId") int insuranceId) {
		Insurance insurance = insuranceService.getById(insuranceId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "insruance found");
		return ResponseEntity.status(200).headers(headers).body(insurance);
	}
	
}