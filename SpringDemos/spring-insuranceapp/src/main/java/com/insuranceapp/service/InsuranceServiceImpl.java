package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;

@Service
public class InsuranceServiceImpl implements IInsuranceService {

	@Override
	public List<Insurance> getAll() {
		return getAllInsurances();
	}

	@Override
	public Insurance getById(int insuranceId) {
		
		for (Insurance insurance : getAllInsurances()) {
			if (insurance.getInsuranceId() == insuranceId)
				return insurance;
		}
		return null;
	}

	private List<Insurance> getAllInsurances() {
		return Arrays.asList(new Insurance(101, "Lifeline", "LIC", "LIFE", 36, 108000),
				new Insurance(102, "Car Insurance", "Bajaj", "Vehicle", 12, 80000),
				new Insurance(103, "Bike Insurance", "Acko", "Vehicle", 24, 188000),
				new Insurance(104, "Term Life", "Tata", "LIFE", 48, 158000));
	}

}
